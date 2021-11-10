package com.example.youtubeapii.uii.main

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.youtubeapii.R
import com.example.youtubeapii.databinding.ActivityMainBinding
import com.example.youtubeapii.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding , MainViewModel>(ActivityMainBinding::inflate,MainViewModel::class.java) {
    override fun setUpView() {}
}