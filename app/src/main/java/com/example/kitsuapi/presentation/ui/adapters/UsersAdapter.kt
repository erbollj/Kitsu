package com.example.kitsuapi.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kitsuapi.databinding.ItemUserBinding
import com.example.kitsuapi.presentation.model.users.UsersAttributesUI

class UsersAdapter : PagingDataAdapter<UsersAttributesUI, UsersViewHolder>(ResultDiffUtilCallback) {

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        return UsersViewHolder(
            ItemUserBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    private object ResultDiffUtilCallback : DiffUtil.ItemCallback<UsersAttributesUI>() {

        override fun areItemsTheSame(
            oldItem: UsersAttributesUI,
            newItem: UsersAttributesUI
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: UsersAttributesUI,
            newItem: UsersAttributesUI
        ): Boolean {
            return oldItem == newItem
        }

    }
}

class UsersViewHolder(private val binding: ItemUserBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(data: UsersAttributesUI) {
        binding.txtName.text = data.name
        binding.txtFollowers.text = "${data.followersCount} followers"

        if (data.avatar?.original == null) {
            Glide.with(binding.imgAvatar)
                .load("https://static.vecteezy.com/system/resources/previews/004/439/731/original/japanese-kitsune-mask-free-vector.jpg")
                .into(binding.imgAvatar)
        } else {
            Glide.with(binding.imgAvatar).load(data.avatar.original).into(binding.imgAvatar)
        }

    }

}