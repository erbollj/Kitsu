package com.example.kitsuapi.presentation.ui.fragment.createPost

import com.example.domain.useCase.CreatePostUseCase
import com.example.kitsuapi.presentation.base.BaseViewModel
import com.example.kitsuapi.presentation.model.createPost.CreatePostUI
import com.example.kitsuapi.presentation.model.createPost.getPost.PostAttributesUI
import com.example.kitsuapi.presentation.model.createPost.getPost.toUI
import com.example.kitsuapi.presentation.model.createPost.toModel
import kotlinx.coroutines.flow.asStateFlow

class PostViewModel(
    private val useCase: CreatePostUseCase,
) : BaseViewModel() {

    private val _createPost = mutableUiStateFlow<PostAttributesUI>()
    val createPost = _createPost.asStateFlow()

    fun createPost(createPostUI: CreatePostUI) =
        useCase.createPost(createPostUI.toModel()).gatherRequest(_createPost) { it.toUI() }

}