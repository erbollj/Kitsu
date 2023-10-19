package com.example.kitsuapi.presentation.ui.fragment.manga

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapi.R
import com.example.kitsuapi.databinding.FragmentMangaBinding
import com.example.kitsuapi.presentation.base.BaseFragment
import com.example.kitsuapi.presentation.ui.adapters.FilterAdapter
import com.example.kitsuapi.presentation.ui.adapters.MangaAdapter
import com.example.kitsuapi.presentation.ui.fragment.filter.FilterFragment
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class MangaFragment : BaseFragment<FragmentMangaBinding, MangaViewModel>(R.layout.fragment_manga) {

    override val binding: FragmentMangaBinding by viewBinding(FragmentMangaBinding::bind)
    override val viewModel: MangaViewModel by sharedViewModel()
    private val adapter = MangaAdapter()
    private val filterAdapter = FilterAdapter()

    override fun launchObservers() {
        super.launchObservers()
        viewModel.getManga(filterAdapter.getListFilter())
        viewModel.getManga.spectatePaging {
            binding.recycler.adapter = adapter
            adapter.submitData(it)
        }
    }

    override fun initListeners() {
        super.initListeners()
        binding.btnFilter.setOnClickListener {
            val bottomSheet = FilterFragment.newInstance("MangaFragment")
            bottomSheet.show(parentFragmentManager, bottomSheet.tag)
        }
    }

}