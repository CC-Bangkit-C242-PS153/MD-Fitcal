package com.example.capstoneproject.View

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.capstoneproject.R
import com.example.capstoneproject.data.remote.saveFirebaseToken
import com.example.capstoneproject.databinding.ActivityBottomNavigationBinding

class BottomNavigation : AppCompatActivity() {

    private lateinit var binding: ActivityBottomNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBottomNavigationBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView
        saveFirebaseToken(this)
        val navController = findNavController(R.id.nav_host_fragment_activity_bottom_navigation)

        navView.setupWithNavController(navController)
    }
}