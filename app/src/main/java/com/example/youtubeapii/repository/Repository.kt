package com.example.youtubeapii.repository
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.youtubeapii.loco.network.result.Resource
import com.example.youtubeapii.model.playlist.PlayList
import com.example.youtubeapii.model.playlistitems.PlayListItems
import com.example.youtubeapii.remote.RemoteDataSource
import kotlinx.coroutines.Dispatchers

class Repository (private val dataSource: RemoteDataSource) {

    fun fetchYoutubeApiPlayList(): LiveData<Resource<PlayList>> = liveData(Dispatchers.IO) {
        emit(Resource.loading(null))
        val response = dataSource.fetchAllPlaylist()
        emit(response)
    }


    fun fetchYoutubeApiPlaylistItems(id: String): LiveData<Resource<PlayListItems>> = liveData(Dispatchers.IO) {
        emit(Resource.loading(null))
        val response = dataSource.fetchPlaylistItems(id)
        emit(response)
    }
}