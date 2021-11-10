package com.example.youtubeapii.remote

import com.example.youtubeapii.model.playlist.PlayList
import com.example.youtubeapii.model.playlistitems.PlayListItems
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface YouTubeApi {

    @GET("playlist")
         suspend fun fetchAllPlaylist(
       @Query( "part") part : String,
       @Query( "channelid") channel :String,
       @Query("maxResult") maxResult: Int,
      @Query("key") apiKey : String
         ):Response<PlayList>

      @GET("playlistItems")
      suspend fun fetchPlaylistItems(
          @Query("part") part: String,
          @Query("playlistid")playlistId: String,
           @Query("key") apiKey : String,
      ):Response<PlayListItems>

}