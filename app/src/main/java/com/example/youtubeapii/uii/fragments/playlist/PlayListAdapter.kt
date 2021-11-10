package com.example.youtubeapii.uii.fragments.playlist

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeapii.R
import com.example.youtubeapii.databinding.ItemPlaylistBinding
import com.example.youtubeapii.extension.loadImage
import com.example.youtubeapii.model.playlist.Items
import com.example.youtubeapii.model.playlist.PlayList

class PlayListAdapter(
    private val listiner: OnPlaylistClick,
    private val playList: PlayList

) :
    RecyclerView.Adapter<PlayListAdapter.ViewHolder>() {

    private var context: Context? = null


    inner class ViewHolder(private val view: ItemPlaylistBinding, private val context: Context) :
        RecyclerView.ViewHolder(view.root) {
        @SuppressLint("SetTextI18n")
        fun bindPhoto(item: Items) {
            view.textTitle.text = item.snippet.title
            view.imageView.loadImage(context, item.snippet.thumbnails.default.url)
            view.textVideoAmount.text =
                "${item.contentDetails.itemCount} ${context.getString(R.string.video_series)}"
            view.root.setOnClickListener {
                Log.e("fdsfsdf", "onBindHolder : $position")
                listiner.onPlaylist(playList.items[position])
            }


        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    context = parent.context
        return ViewHolder(
            ItemPlaylistBinding.inflate(LayoutInflater.from(context),parent,false),
            context as Context
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.bindPhoto(playList.items[position])
    }

    override fun getItemCount() = playList.items.size
}