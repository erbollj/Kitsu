package com.example.kitsuapi.presentation.ui.fragment.manga

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.kitsuapi.databinding.FragmentMangaBinding
import com.example.kitsuapi.presentation.base.BaseFragment

class MangaFragment: BaseFragment<FragmentMangaBinding, MangaViewModel>() {

    override val viewModel: MangaViewModel by viewModels()

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentMangaBinding {
        return FragmentMangaBinding.inflate(inflater, container, false)
    }

    override fun initView() {
    }

    override fun initListener() {
    }

}