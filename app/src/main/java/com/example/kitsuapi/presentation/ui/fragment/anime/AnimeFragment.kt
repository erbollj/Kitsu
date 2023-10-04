package com.example.kitsuapi.presentation.ui.fragment.anime

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.kitsuapi.databinding.FragmentAnimeBinding
import com.example.kitsuapi.presentation.base.BaseFragment
import com.example.kitsuapi.presentation.ui.adapters.AnimeAdapter
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class AnimeFragment: BaseFragment<FragmentAnimeBinding, AnimeViewModel>() {

    override val viewModel: AnimeViewModel by viewModel()
    private val adapter = AnimeAdapter()

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentAnimeBinding {
        return FragmentAnimeBinding.inflate(inflater, container, false)
    }

    override fun initView() {
        viewModel.getAnime()
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.getAnime.collect {
                    binding.recycler.adapter = adapter
                    adapter.submitData(it)
                    Log.e("ololo", "anime: $it")
                }
            }
        }
    }

    override fun initListener() {
    }

}