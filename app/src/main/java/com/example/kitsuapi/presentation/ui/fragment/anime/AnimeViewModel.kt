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

/**
 * ViewModel для работы с данными аниме.
 *
 * @param getAnimeUseCase Use case для получения данных аниме.
 */
class AnimeViewModel(private val getAnimeUseCase: GetAnimeUseCase) : BaseViewModel() {

    private var _getAnime =
        MutableStateFlow<PagingData<AnimeAttributesUI>>(PagingData.empty())
    val getAnime = _getAnime.asStateFlow()

    /**
     * Получение данных аниме с возможностью фильтрации и обновление [_getAnime].
     *
     * @param filter Список категорий для фильтрации данных (может быть null).
     */
    fun getAnime(filter: List<String>? = emptyList()) {
        viewModelScope.launch {
            getAnimeUseCase.getAnime(filter).collect {
                _getAnime.value = it.map { it.toUI() }
            }
        }
    }

}