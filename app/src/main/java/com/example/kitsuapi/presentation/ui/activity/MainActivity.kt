package com.example.kitsuapi.presentation.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.example.data.local.SharedPreferencesManager
import com.example.kitsuapi.R
import com.example.kitsuapi.databinding.ActivityMainBinding
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val sharedPreferencesManager: SharedPreferencesManager by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.splashScreenTheme)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setStartDestination()
    }

    private fun setStartDestination() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val navGraph = navController.navInflater.inflate(R.navigation.nav_graph)


        Log.e("erbol", "boolean: " + sharedPreferencesManager.getBoolean())

        if (sharedPreferencesManager.getAccessToken() != null) {
            navGraph.setStartDestination(R.id.mainFlowFragment)
        } else {
            Log.e("erbol", "activity: " + sharedPreferencesManager.getAccessToken())
            navGraph.setStartDestination(R.id.loginFlowFragment)
        }

        navController.graph = navGraph

    }


}