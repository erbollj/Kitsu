package com.example.kitsuapi.presentation.ui.fragment.user

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapi.R
import com.example.kitsuapi.databinding.FragmentUsersBinding
import com.example.kitsuapi.presentation.base.BaseFragment
import com.example.kitsuapi.presentation.ui.adapters.UsersAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class UsersFragment : BaseFragment<FragmentUsersBinding, UserViewModel>(R.layout.fragment_users) {

    override val binding: FragmentUsersBinding by viewBinding(FragmentUsersBinding::bind)
    override val viewModel: UserViewModel by viewModel()
    private val adapter = UsersAdapter()

    override fun launchObservers() {
        super.launchObservers()
        viewModel.getUsers()
        viewModel.getUsers.spectatePaging {
            binding.recycler.adapter = adapter
            adapter.submitData(it)
        }
    }

}