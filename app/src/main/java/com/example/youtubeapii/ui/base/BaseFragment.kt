package com.example.youtubeapii.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<Binding : ViewBinding, VM : BaseViewModel>(private val inflate: (LayoutInflater, ViewGroup?, Boolean) -> Binding) :
    Fragment() {
    private var _binding: Binding? = null
    val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate.invoke(inflater, container, false)
        setypLiveData()
        setypUI()
    return binding.root
    }

    private fun setypUI() {}

    private fun setypLiveData() {}
}
