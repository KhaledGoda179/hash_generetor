package com.example.hashgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hashgenerator.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    lateinit var viewBinding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        viewBinding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        initViews()
    }

    private fun initViews() {

        val result = getIntent().getStringExtra("result")
        viewBinding.TEXTVIEWRESULT.setText(result)
    }
}