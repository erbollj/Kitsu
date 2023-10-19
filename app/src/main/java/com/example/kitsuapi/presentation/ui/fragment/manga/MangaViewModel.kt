package com.example.kitsuapi.presentation.ui.fragment.manga

import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.map
import com.example.domain.useCase.GetMangaUseCase
import com.example.kitsuapi.presentation.base.BaseViewModel
import com.example.kitsuapi.presentation.model.manga.MangaAttributesUI
import com.example.kitsuapi.presentation.model.manga.toUI
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MangaViewModel(private val getMangaUseCase: GetMangaUseCase) : BaseViewModel() {

    private var _getManga =
        MutableStateFlow<PagingData<MangaAttributesUI>>(PagingData.empty())
    val getManga = _getManga.asStateFlow()

    fun getManga(filter: List<String>?) {
        viewModelScope.launch {
            getMangaUseCase.getAnime(filter).collect {
                _getManga.value = it.map { it.toUI() }
            }
        }
    }

}