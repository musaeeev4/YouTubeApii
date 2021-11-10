package com.example.youtubeapii.di

import com.example.youtubeapii.remote.RemoteDataSource
import org.koin.dsl.module
import kotlin.math.sin

val  RemmoteDataSource = module {
    single {  RemoteDataSource(get()) }

}
