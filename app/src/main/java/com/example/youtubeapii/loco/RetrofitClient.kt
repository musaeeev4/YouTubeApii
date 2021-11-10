package com.example.youtubeapii.di

import com.example.youtubeapii.`object`.Constant
import com.example.youtubeapii.remote.YouTubeApi
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val netwokrModule = module {
    factory { providerOkHttpClient() }
    factory { providerApi(get()) }

    single { providerRetrofitClient(get()) }

}

fun providerOkHttpClient(): OkHttpClient {
    return OkHttpClient().newBuilder()
        .connectTimeout(30,TimeUnit.SECONDS)
        .writeTimeout(30,TimeUnit.SECONDS)
        .readTimeout(30,TimeUnit.SECONDS)
        .build()
}

fun providerRetrofitClient(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(Constant.BASE_URL)
        .client(okHttpClient)
        .build()

}

fun providerApi(retrofit: Retrofit) : YouTubeApi {
     return retrofit.create(YouTubeApi::class.java)
}
