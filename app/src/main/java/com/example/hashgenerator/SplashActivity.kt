package com.example.hashgenerator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.hashgenerator.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)


        initViews()

    }

    private fun initViews() {
        startSplash()
    }

    private fun startSplash(){
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, HashingActivity::class.java)
            startActivity(intent)
            finish()
        },2000)
    }
}