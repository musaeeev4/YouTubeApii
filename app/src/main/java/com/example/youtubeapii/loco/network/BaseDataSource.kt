package com.example.youtubeapii.loco.network

import com.example.youtubeapii.loco.network.result.Resource
import retrofit2.Response

abstract class BaseDataSource {

    protected suspend fun <T> getResult(call: suspend () -> Response<T>): Resource<T> {
        try {
            val responce = call()
            if (responce.isSuccessful) {
                val body = responce.body()

                if (body != null) return Resource.succes(body)
            } else {
                return Resource.error(responce.message(), responce.body(), responce.code())
            }
        } catch (e: Exception) {
            return Resource.error(
                e.message ?: toString(),
                null,
                429
            )
        }
        return Resource.error(null, null, 429)
    }
}