package com.example.kitsuapi.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kitsuapi.databinding.ItemCardBinding
import com.example.kitsuapi.presentation.model.anime.AnimeAttributesUI

class AnimeAdapter : PagingDataAdapter<AnimeAttributesUI, AnimeViewHolder>(ResultDiffUtilCallback) {

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            ItemCardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    private object ResultDiffUtilCallback : DiffUtil.ItemCallback<AnimeAttributesUI>() {

        override fun areItemsTheSame(
            oldItem: AnimeAttributesUI,
            newItem: AnimeAttributesUI
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: AnimeAttributesUI,
            newItem: AnimeAttributesUI
        ): Boolean {
            return oldItem == newItem
        }

    }
}

class AnimeViewHolder(private val binding: ItemCardBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(data: AnimeAttributesUI) {
        Glide.with(binding.imgPoster).load(data.posterImageModel?.original).into(binding.imgPoster)
//        binding.txt.text = data.titlesModel!!.en
    }

}