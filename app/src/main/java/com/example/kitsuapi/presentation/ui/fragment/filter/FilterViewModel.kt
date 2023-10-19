package com.example.kitsuapi.presentation.ui.fragment.filter

import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.map
import com.example.domain.useCase.GetFilterUseCase
import com.example.kitsuapi.presentation.base.BaseViewModel
import com.example.kitsuapi.presentation.model.filter.FilterAttributesUI
import com.example.kitsuapi.presentation.model.filter.toUI
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class FilterViewModel(private val getFilterUseCase: GetFilterUseCase) : BaseViewModel() {

    private var _getFilter =
        MutableStateFlow<PagingData<FilterAttributesUI>>(PagingData.empty())
    val getFilter = _getFilter.asStateFlow()

    fun getFilter() {
        viewModelScope.launch {
            getFilterUseCase.getFilter().collect {
                _getFilter.value = it.map { it.toUI() }
            }
        }
    }

}