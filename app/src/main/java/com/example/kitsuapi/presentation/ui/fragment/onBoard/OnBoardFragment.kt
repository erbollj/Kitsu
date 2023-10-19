package com.example.kitsuapi.presentation.ui.fragment.onBoard

import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapi.R
import com.example.kitsuapi.databinding.FragmentOnBoardBinding
import com.example.kitsuapi.presentation.base.BaseFragment
import com.example.kitsuapi.presentation.model.onBoard.OnBoardUI
import com.example.kitsuapi.presentation.ui.adapters.OnBoardAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class OnBoardFragment :
    BaseFragment<FragmentOnBoardBinding, OnBoardViewModel>(R.layout.fragment_on_board) {

    override val binding: FragmentOnBoardBinding by viewBinding(FragmentOnBoardBinding::bind)
    override val viewModel: OnBoardViewModel by viewModel()
    val list = arrayListOf(
        OnBoardUI(
            R.raw.saske, "MORE OF WHAT YOU LOVE",
            "Get recommendations to discover your next favorite anime or manga."
        ),
        OnBoardUI(
            R.raw.fox_lottie, "TRACK YOUR PROGRESS",
            "Log an rate what you have seen and red to build a library of your history."
        ),
        OnBoardUI(
            R.raw.anime, "JOIN THE COMMUNITY",
            "Kitsu makes finding new like-minded friends easy with the global activity feed."
        )
    )

    override fun initialize() {
        super.initialize()
        binding.viewPager.adapter = OnBoardAdapter(list)

    }

    override fun initListeners() {
        super.initListeners()
        binding.apply {

            btnNext.setOnClickListener {
                if (viewPager.currentItem + 1 < list.size) {
                    viewPager.currentItem++
                } else {
                    findNavController().navigate(R.id.action_onBoardFragment_to_loginFragment)
                }
            }

            txtSkip.setOnClickListener {
                findNavController().navigate(R.id.action_onBoardFragment_to_loginFragment)
            }

        }
    }


}