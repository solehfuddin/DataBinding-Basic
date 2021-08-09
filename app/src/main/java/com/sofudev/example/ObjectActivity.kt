package com.sofudev.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sofudev.example.databinding.ActivityObjectBinding

class ObjectActivity : AppCompatActivity() {
    private lateinit var binding: ActivityObjectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_object)
        binding.data = getAccount()
    }

    private fun getAccount() : Account {
        return Account(1, "Udin", "Udin@trl.co")
    }
}