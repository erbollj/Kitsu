package com.example.kitsuapi.presentation.ui.fragment.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.kitsuapi.databinding.FragmentUsersBinding
import com.example.kitsuapi.presentation.base.BaseFragment

class UsersFragment: BaseFragment<FragmentUsersBinding, UserViewModel>() {

    override val viewModel: UserViewModel by viewModels()

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentUsersBinding {
        return FragmentUsersBinding.inflate(inflater, container, false)
    }

    override fun initView() {
    }

    override fun initListener() {
    }

}