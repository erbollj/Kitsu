package com.example.kitsuapi.presentation.ui.fragment.anime

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapi.R
import com.example.kitsuapi.databinding.FragmentAnimeBinding
import com.example.kitsuapi.presentation.base.BaseFragment
import com.example.kitsuapi.presentation.ui.adapters.AnimeAdapter
import com.example.kitsuapi.presentation.ui.adapters.FilterAdapter
import com.example.kitsuapi.presentation.ui.fragment.filter.FilterFragment
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

/**
 * Фрагмент для отображения данных аниме.
 */
class AnimeFragment(
) : BaseFragment<FragmentAnimeBinding, AnimeViewModel>(R.layout.fragment_anime) {

    override val binding: FragmentAnimeBinding by viewBinding(FragmentAnimeBinding::bind)
    override val viewModel: AnimeViewModel by sharedViewModel()
    private val adapter = AnimeAdapter()
    private val filterAdapter = FilterAdapter()

    /**
     * Функция инициализирует загрузку данных аниме с использованием viewModel.
     * getAnime и передает фильтры из filterAdapter.
     * Затем она наблюдает за изменениями данных, используя collectLatest, и обновляет адаптер с данными аниме в соответствии с новыми данными.
     */
    override fun launchObservers() {
        super.launchObservers()
        viewModel.getAnime(
            if (filterAdapter.getListFilter()
                    .isEmpty()
            ) emptyList() else filterAdapter.getListFilter()
        )
        viewModel.getAnime.spectatePaging {
            adapter.submitData(it)
        }
        binding.recycler.adapter = adapter
    }

    /**
     * Он вызывает родительский метод для конструкции общих слушателей и добавляет собственный обработчик для кнопки "btnFilter".
     */
    override fun initListeners() {
        super.initListeners()
        binding.btnFilter.setOnClickListener {
            val bottomSheet = FilterFragment.newInstance("AnimeFragment")
            bottomSheet.show(parentFragmentManager, bottomSheet.tag)
        }
    }

}