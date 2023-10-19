package com.example.kitsuapi.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieDrawable
import com.example.kitsuapi.databinding.ItemOnBoardBinding
import com.example.kitsuapi.presentation.model.onBoard.OnBoardUI

class OnBoardAdapter(val list: ArrayList<OnBoardUI>) :
    RecyclerView.Adapter<OnBoardAdapter.OnBoardViewHolder>() {

    inner class OnBoardViewHolder(private val binding: ItemOnBoardBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: OnBoardUI) {
            binding.imgLottie.setAnimation(data.image)
            binding.imgLottie.playAnimation()
            binding.imgLottie.repeatCount = LottieDrawable.INFINITE
            binding.txtTitle.text = data.title
            binding.txtDescription.text = data.description
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardViewHolder {
        val binding = ItemOnBoardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return OnBoardViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: OnBoardViewHolder, position: Int) {
        holder.bind(list[position])
    }

}
