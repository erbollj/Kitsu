package com.example.kitsuapi.presentation.ui.fragment.login

import android.util.Log
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.data.local.SharedPreferencesManager
import com.example.kitsuapi.R
import com.example.kitsuapi.databinding.FragmentLoginBinding
import com.example.kitsuapi.presentation.base.BaseFragment
import com.example.kitsuapi.presentation.model.login.UserDataUI
import com.example.kitsuapi.presentation.utils.activityNavController
import com.example.kitsuapi.presentation.utils.navigateSafely
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginFragment : BaseFragment<FragmentLoginBinding, LoginViewModel>(
    R.layout.fragment_login,
) {

    override val binding: FragmentLoginBinding by viewBinding(FragmentLoginBinding::bind)
    override val viewModel: LoginViewModel by viewModel()
    private val sharedPreferencesManager: SharedPreferencesManager by inject()

    override fun initListeners() {
        super.initListeners()
        binding.apply {
            btnLogin.setOnClickListener {
                val grantType = "password"
                val email = etEmail.text.toString()
                val password = etPassword.text.toString()

                viewModel.login(UserDataUI(grantType, password, email))
            }
        }
    }


    override fun launchObservers() = with(binding) {
        super.launchObservers()
        viewModel.login.spectateUiState(
            error = {
                Log.e("erbol", "invalid login")
            },
            success = {
                if (it.accessToken != null) {
                    sharedPreferencesManager.saveAccessToken(it.accessToken)
                    Log.e("erbol", "toooooken: " + sharedPreferencesManager.getAccessToken())
                    activityNavController().navigateSafely(R.id.action_global_mainFlowFragment)
                }
            }
        )
    }


}