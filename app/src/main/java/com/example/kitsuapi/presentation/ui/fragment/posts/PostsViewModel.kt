package com.example.kitsuapi.presentation.ui.fragment.posts

import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.map
import com.example.domain.useCase.GetPostsUseCase
import com.example.kitsuapi.presentation.base.BaseViewModel
import com.example.kitsuapi.presentation.model.posts.PostsAttributesUI
import com.example.kitsuapi.presentation.model.posts.toUI
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class PostsViewModel(private val useCase: GetPostsUseCase) : BaseViewModel() {

    private var _getPosts =
        MutableStateFlow<PagingData<PostsAttributesUI>>(PagingData.empty())
    val getPosts = _getPosts.asStateFlow()

    fun getPosts() {
        viewModelScope.launch {
            useCase.getPosts().collect {
                _getPosts.value = it.map { it.toUI() }
            }
        }
    }

}