package com.example.hashgenerator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.hashgenerator.databinding.ActivityHashingBinding
import com.google.android.material.snackbar.Snackbar

class HashingActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityHashingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityHashingBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        initViews()
        generateHashOnClick()
    }

    private fun initViews() {
        val algorithmList = resources.getStringArray(R.array.hashing_algorithms)
        val adapter = ArrayAdapter(this, R.layout.drop_down_item,algorithmList)
        viewBinding.algorithms.setAdapter(adapter)


    }
    fun generateHashOnClick(){
        viewBinding.btnGenerate.setOnClickListener{
            if (viewBinding.editText.text.isNullOrEmpty()){
                Toast.makeText(this, "Text is empty !", Toast.LENGTH_SHORT).show()
            }

            val plainText = viewBinding.editText.text.toString()
            val algorithm =viewBinding.algorithms.text.toString()
            val hashing = HashLogic().getHash(plainText, algorithm)


            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("result", hashing)
            startActivity(intent)
        }
    }

}