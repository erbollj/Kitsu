package com.example.kitsuapi.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kitsuapi.databinding.ItemCardBinding
import com.example.kitsuapi.presentation.model.anime.AnimeAttributesUI

/**
 * Адаптер для отображения данных аниме с использованием пагинации.
 */
class AnimeAdapter : PagingDataAdapter<AnimeAttributesUI, AnimeViewHolder>(ResultDiffUtilCallback) {

    /**
     * Привязка данных аниме к холдеру в указанной позиции.
     *
     * @param holder Холдер элемента списка аниме.
     * @param position Позиция элемента в списке.
     */
    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }

    /**
     * Создание нового холдера для элемента аниме.
     *
     * @param parent Родительский ViewGroup, к которому будет привязан элемент.
     * @param viewType Тип view.
     * @return Созданный холдер элемента аниме.
     */
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

/**
 * Холдер элемента аниме, связанный с макетом item_card.xml.
 *
 * @param binding Привязка к макету элемента.
 */
class AnimeViewHolder(private val binding: ItemCardBinding) :
    RecyclerView.ViewHolder(binding.root) {

    /**
     * Привязка данных аниме к элементу холдера.
     * @param data Данные аниме для отображения.
     */
    fun bind(data: AnimeAttributesUI) {
        Glide.with(binding.imgPoster).load(data.posterImageModel?.original).into(binding.imgPoster)
        binding.txt.text = data.titlesModel!!.en
    }

}