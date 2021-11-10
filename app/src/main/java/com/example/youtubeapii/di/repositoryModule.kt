package com.example.youtubeapii.di

import com.example.youtubeapii.repository.Repository
import org.koin.dsl.module

val repositoryModule = module {
    single { Repository(get()) }

}
