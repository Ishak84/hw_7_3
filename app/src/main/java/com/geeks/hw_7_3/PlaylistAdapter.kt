package com.geeks.hw_7_3

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.geeks.hw_7_3.databinding.ItemPlaylistBinding

class PlaylistAdapter(private val list:ArrayList<Playlist>):Adapter<PlaylistAdapter.PlaylistViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        return PlaylistViewHolder(ItemPlaylistBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        holder.bind(list[position])

        holder.itemView.setOnClickListener{
            val musicName = list[position].musicName
            val intent = Intent(holder.itemView.context, MainActivity2::class.java)
            intent.putExtra("musicName", musicName)
            holder.itemView.context.startActivity(intent)
        }
    }

    inner class PlaylistViewHolder(private val binding:ItemPlaylistBinding):ViewHolder(binding.root){
        fun bind(playlist: Playlist) {
            binding.tvMusicName.text = playlist.musicName
            binding.tvName.text = playlist.author
            binding.tvLength.text = playlist.length
            binding.tvCount.text = adapterPosition.toString()
        }
    }
}