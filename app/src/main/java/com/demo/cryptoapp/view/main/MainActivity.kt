package com.demo.cryptoapp.view.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.demo.cryptoapp.databinding.ActivityMainBinding
import com.demo.cryptoapp.view.home.HomeActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        mainBinding.btnAccess.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    HomeActivity::class.java
                )
            )
        }

    }
}