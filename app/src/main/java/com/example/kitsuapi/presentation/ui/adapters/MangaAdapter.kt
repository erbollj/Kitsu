package com.example.kitsuapi.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kitsuapi.databinding.ItemCardBinding
import com.example.kitsuapi.presentation.model.manga.MangaAttributesUI

class MangaAdapter : PagingDataAdapter<MangaAttributesUI, MangaViewHolder>(ResultDiffUtilCallback) {

    override fun onBindViewHolder(holder: MangaViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MangaViewHolder {
        return MangaViewHolder(
            ItemCardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    private object ResultDiffUtilCallback : DiffUtil.ItemCallback<MangaAttributesUI>() {

        override fun areItemsTheSame(
            oldItem: MangaAttributesUI,
            newItem: MangaAttributesUI
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: MangaAttributesUI,
            newItem: MangaAttributesUI
        ): Boolean {
            return oldItem == newItem
        }

    }
}

class MangaViewHolder(private val binding: ItemCardBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(data: MangaAttributesUI) {
        Glide.with(binding.imgPoster).load(data.posterImage?.original).into(binding.imgPoster)
        binding.txt.text = data.titles!!.en
    }

}