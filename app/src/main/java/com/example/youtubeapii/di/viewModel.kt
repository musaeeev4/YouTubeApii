package com.example.youtubeapii.di

import androidx.appcompat.widget.AppCompatDrawableManager.get
import com.example.youtubeapii.uii.fragments.detail.DetailViewModel
import com.example.youtubeapii.uii.fragments.playlist.PlaylistViewModelFragment
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val  viewModel : Module = module {
    viewModel{DetailViewModel(get())}
    viewModel{ PlaylistViewModelFragment(get()) }

}
