package com.example.kitsuapi.presentation.ui.fragment.filter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.kitsuapi.databinding.FragmentFilterBinding
import com.example.kitsuapi.presentation.ui.adapters.FilterAdapter
import com.example.kitsuapi.presentation.ui.fragment.anime.AnimeViewModel
import com.example.kitsuapi.presentation.ui.fragment.manga.MangaViewModel
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class FilterFragment : BottomSheetDialogFragment() {

    private val viewModel: FilterViewModel by viewModel()
    private val animeSharedViewModel: AnimeViewModel by sharedViewModel()
    private val mangaSharedViewModel: MangaViewModel by sharedViewModel()
    private lateinit var binding: FragmentFilterBinding
    private val adapter = FilterAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFilterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        launchObservers()
        initListener()
    }


    private fun initListener() {
        val callingFragment = arguments?.getString("callingFragment")

        binding.btnReset.setOnClickListener {
            when (callingFragment) {
                "AnimeFragment" -> {
                    animeSharedViewModel.getAnime(emptyList())
                }

                "MangaFragment" -> {
                    mangaSharedViewModel.getManga(emptyList())
                }

            }
            dismiss()
        }

        binding.btnApply.setOnClickListener {
            when (callingFragment) {
                "AnimeFragment" -> {
                    animeSharedViewModel.getAnime(adapter.getListFilter())
                }

                "MangaFragment" -> {
                    mangaSharedViewModel.getManga(adapter.getListFilter())
                }

            }
            dismiss()
        }

    }

    private fun launchObservers() {
        viewModel.getFilter()
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.getFilter.collect {
                    binding.recycler.adapter = adapter
                    adapter.submitData(it)
                }
            }
        }
    }

    companion object {
        fun newInstance(callingFragment: String): FilterFragment {
            val args = Bundle()
            args.putString("callingFragment", callingFragment)

            val fragment = FilterFragment()
            fragment.arguments = args
            return fragment
        }
    }

}