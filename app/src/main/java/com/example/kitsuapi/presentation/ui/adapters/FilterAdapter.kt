package com.example.kitsuapi.presentation.ui.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsuapi.databinding.ItemFilterBinding
import com.example.kitsuapi.presentation.model.filter.FilterAttributesUI

class FilterAdapter :
    PagingDataAdapter<FilterAttributesUI, FilterAdapter.FilterViewHolder>(ResultDiffUtilCallback) {

    var list = arrayListOf<String>()

    fun getListFilter(): ArrayList<String> {
        return list
    }

    override fun onBindViewHolder(holder: FilterViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilterViewHolder {
        return FilterViewHolder(
            ItemFilterBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    private object ResultDiffUtilCallback : DiffUtil.ItemCallback<FilterAttributesUI>() {

        override fun areItemsTheSame(
            oldItem: FilterAttributesUI,
            newItem: FilterAttributesUI
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: FilterAttributesUI,
            newItem: FilterAttributesUI
        ): Boolean {
            return oldItem == newItem
        }

    }

    inner class FilterViewHolder(private val binding: ItemFilterBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: FilterAttributesUI) {
            binding.checkbox.text = data.title

            binding.checkbox.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    list.add(binding.checkbox.text.toString())
                } else {
                    list.remove(binding.checkbox.text.toString())
                }
                Log.e("erbol", list.joinToString())
            }

        }

    }

}
