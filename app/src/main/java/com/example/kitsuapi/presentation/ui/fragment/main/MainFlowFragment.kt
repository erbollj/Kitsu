package com.example.kitsuapi.presentation.ui.fragment.main

import androidx.navigation.NavController
import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapi.R
import com.example.kitsuapi.databinding.FragmentMainFlowBinding
import com.example.kitsuapi.presentation.base.BaseFlowFragment


class MainFlowFragment : BaseFlowFragment(
    R.layout.fragment_main_flow,
    R.id.nav_host_fragment_main
) {
    private val binding: FragmentMainFlowBinding by viewBinding(FragmentMainFlowBinding::bind)

    override fun setupNavigation(navController: NavController) {
        super.setupNavigation(navController)
        binding.bottomNav.setupWithNavController(navController)
    }

}