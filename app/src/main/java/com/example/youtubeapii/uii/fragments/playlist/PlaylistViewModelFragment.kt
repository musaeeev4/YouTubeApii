package com.example.youtubeapii.uii.fragments.playlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.youtubeapii.loco.network.result.Resource
import com.example.youtubeapii.model.playlist.PlayList
import com.example.youtubeapii.repository.Repository
import com.example.youtubeapii.ui.base.BaseViewModel

class PlaylistViewModelFragment (private val  repository: Repository) : BaseViewModel(){
var loading = MutableLiveData<Boolean>()

    fun fetchPlayList () : LiveData<Resource<PlayList>> {
      return repository.fetchYouTubeApiPlayList()
    }

}
