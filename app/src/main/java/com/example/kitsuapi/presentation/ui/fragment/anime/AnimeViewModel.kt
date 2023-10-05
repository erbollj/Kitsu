package com.example.kitsuapi.presentation.ui.fragment.anime

import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.map
import com.example.domain.useCase.GetAnimeUseCase
import com.example.kitsuapi.presentation.base.BaseViewModel
import com.example.kitsuapi.presentation.model.anime.AnimeAttributesUI
import com.example.kitsuapi.presentation.model.anime.toUI
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class AnimeViewModel(private val getAnimeUseCase: GetAnimeUseCase) : BaseViewModel() {

    private var _getAnime =
        MutableStateFlow<PagingData<AnimeAttributesUI>>(PagingData.empty())
    val getAnime = _getAnime.asStateFlow()

    fun getAnime() {
        viewModelScope.launch {
            getAnimeUseCase.getAnime().collect {
                _getAnime.value = it.map { it.toUI() }
            }
        }
    }

}