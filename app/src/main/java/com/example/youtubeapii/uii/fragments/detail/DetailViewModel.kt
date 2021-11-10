package com.example.youtubeapii.uii.fragments.detail

import androidx.lifecycle.LiveData
import com.bumptech.glide.load.engine.Resource
import com.example.youtubeapii.model.playlistitems.PlayListItems
import com.example.youtubeapii.repository.Repository
import com.example.youtubeapii.ui.base.BaseViewModel

class DetailViewModel (private  val  repository : Repository) : BaseViewModel() {
   fun fetchPlayListItems (id : String) : LiveData<Resource<PlayListItems>>{
      return repository.
   }
}