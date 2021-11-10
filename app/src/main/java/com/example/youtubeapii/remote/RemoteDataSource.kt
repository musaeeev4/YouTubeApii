package com.example.youtubeapii.remote

import com.example.youtubeapii.`object`.Constant
import com.example.youtubeapii.loco.network.BaseDataSource


class RemoteDataSource(private var apiService: YouTubeApi) : BaseDataSource() {
    suspend fun fetchAllPlaylist() {
        apiService.fetchAllPlaylist(
            Constant.PART,
            Constant.CHANNEL_ID,
            Constant.MAX_RESULT,
            Constant.API_KEY
        )
    }

    suspend fun fetchPlaylistItems(id: String) {
        apiService.fetchPlaylistItems(
            Constant.PART,
            id,
            Constant.API_KEY
        )
    }
}