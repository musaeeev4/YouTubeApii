package com.example.youtubeapii.uii.fragments.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.youtubeapii.R
import com.example.youtubeapii.databinding.FragmentDetailBinding
import com.example.youtubeapii.databinding.ScroolingContent1Binding
import com.example.youtubeapii.databinding.ScroolingContent2Binding
import com.example.youtubeapii.ui.base.BaseFragment

class DetailsFragment : BaseFragment<FragmentDetailBinding,DetailViewModel>(
   FragmentDetailBinding::inflate

),OnPlaylistItemClick{
    private lateinit var bottomBinding : ScroolingContent2Binding
}