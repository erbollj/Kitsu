package com.example.kitsuapi.presentation.ui.fragment.manga

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.kitsuapi.databinding.FragmentMangaBinding
import com.example.kitsuapi.presentation.base.BaseFragment
import com.example.kitsuapi.presentation.ui.adapters.MangaAdapter
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class MangaFragment : BaseFragment<FragmentMangaBinding, MangaViewModel>() {

    override val viewModel: MangaViewModel by viewModel()
    private val adapter = MangaAdapter()

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentMangaBinding {
        return FragmentMangaBinding.inflate(inflater, container, false)
    }

    override fun initView() {
        viewModel.getManga()
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.getManga.collect {
                    binding.recycler.adapter = adapter
                    adapter.submitData(it)
                }
            }
        }
    }

    override fun initListener() {
    }

}