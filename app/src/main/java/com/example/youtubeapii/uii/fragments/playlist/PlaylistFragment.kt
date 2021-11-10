package com.example.youtubeapii.uii.fragments.playlist

import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.youtubeapii.databinding.FragmentPlaylistBinding
import com.example.youtubeapii.databinding.ScroolingContent1Binding
import com.example.youtubeapii.ui.base.BaseFragment
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.slider.Slider
import org.koin.androidx.viewmodel.ext.android.viewModel


class PlaylistFragment : BaseFragment<FragmentPlaylistBinding, PlaylistViewModelFragment>(
    FragmentPlaylistBinding::inflate,
), OnPlaylistClick {

    private lateinit var bottomSheetBehavior: BottomSheetBehavior<LinearLayout>
    private lateinit var bottomBinding: ScroolingContent1Binding
    private val viewModel: PlaylistViewModelFragment by viewModel()

    override fun setupLiveData() {}

    override fun setupUI() {
    bottomBinding = binding.scrollingContent
    bottomSheetBehavior = BottomSheetBehavior.from(bottomBinding.baatyr)

        bottomSheetBehavior.addBottomSheetCallback(object :
        BottomSheetBehavior.BottomSheetCallback(){
            override fun onSclide(bottomSheet : View, slideOffset : Float) {}
            override fun onStateChanged(bottomSheet: View, newState: Int) {}

        })

        (activity as AppCompatActivity).supportActionBar
    }
}