package com.sofudev.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.sofudev.example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.submitButton.setOnClickListener {
            showName()
        }

        binding.controlButton.setOnClickListener {
            showHideLoader()
        }
    }

    private fun showName()
    {
        binding.nameTextview.text = binding.inputEdittext.text
    }

    private fun showHideLoader()
    {
        if (binding.controlButton.text.equals("Hide"))
        {
            val show = "Show"
            binding.controlButton.text = show
            binding.loadingProgressbar.visibility = View.INVISIBLE
        }
        else
        {
            val hide = "Hide"
            binding.controlButton.text = hide
            binding.loadingProgressbar.visibility = View.VISIBLE
        }
    }
}