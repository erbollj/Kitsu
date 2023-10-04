package com.example.kitsuapi.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kitsuapi.databinding.ItemCardBinding
import com.example.kitsuapi.presentation.model.anime.AttributesUI

class AnimeAdapter : PagingDataAdapter<AttributesUI, ResultViewHolder>(ResultDiffUtilCallback) {

    override fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
        return ResultViewHolder(
            ItemCardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    private object ResultDiffUtilCallback : DiffUtil.ItemCallback<AttributesUI>() {

        override fun areItemsTheSame(
            oldItem: AttributesUI,
            newItem: AttributesUI
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: AttributesUI,
            newItem: AttributesUI
        ): Boolean {
            return oldItem == newItem
        }

    }
}

class ResultViewHolder(private val binding: ItemCardBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(position: AttributesUI) {
        Glide.with(binding.image).load(position.posterImageModel?.original).into(binding.image)
    }

}