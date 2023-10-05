package com.example.kitsuapi.presentation.ui.fragment.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.kitsuapi.databinding.FragmentUsersBinding
import com.example.kitsuapi.presentation.base.BaseFragment
import com.example.kitsuapi.presentation.ui.adapters.UsersAdapter
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class UsersFragment : BaseFragment<FragmentUsersBinding, UserViewModel>() {

    override val viewModel: UserViewModel by viewModel()
    private val adapter = UsersAdapter()

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentUsersBinding {
        return FragmentUsersBinding.inflate(inflater, container, false)
    }

    override fun initView() {
        viewModel.getUsers()
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.getUsers.collect {
                    binding.recycler.adapter = adapter
                    adapter.submitData(it)
                }
            }
        }
    }

    override fun initListener() {
    }

}