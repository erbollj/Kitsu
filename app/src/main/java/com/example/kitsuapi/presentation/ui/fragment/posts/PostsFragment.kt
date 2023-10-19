package com.example.kitsuapi.presentation.ui.fragment.posts

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapi.R
import com.example.kitsuapi.databinding.FragmentPostsBinding
import com.example.kitsuapi.presentation.base.BaseFragment
import com.example.kitsuapi.presentation.ui.adapters.PostsAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class PostsFragment() :
    BaseFragment<FragmentPostsBinding, PostsViewModel>(R.layout.fragment_posts) {

    override val binding: FragmentPostsBinding by viewBinding(FragmentPostsBinding::bind)
    override val viewModel: PostsViewModel by viewModel()
    private val adapter = PostsAdapter()

    override fun launchObservers() {
        super.launchObservers()
        viewModel.getPosts()
        viewModel.getPosts.spectatePaging {
            binding.recycler.adapter = adapter
            adapter.submitData(it)
        }
    }

}