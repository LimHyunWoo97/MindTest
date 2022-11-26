package com.example.mindtestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import  kotlinx.android.synthetic.main.activity_main.*

/*val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
val navController = navHostFragment.navController*/
class MainActivity : AppCompatActivity() {
   lateinit var navController: NavController

   override fun onCreate(savedInstanceState:Bundle?){
       super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       navController = nav_host_fragment.findNavController()
   }
}