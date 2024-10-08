package com.mc.mortgagecalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.mc.mortgagecalculation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.learn.setOnClickListener(View.OnClickListener {
            var priseEstate = binding.priseEstate.getText().toString()
            var initialPayment = binding.initialPayment.getText().toString()
            var interestRate = binding.interestRate.getText().toString()
            var term = binding.term.getText().toString()

        })
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}