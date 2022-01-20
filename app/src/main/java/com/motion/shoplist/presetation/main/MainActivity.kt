package com.motion.shoplist.presetation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.motion.shoplist.R
import com.motion.shoplist.presetation.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private  val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewModel()
    }

    private fun initViewModel() {
        viewModel=ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.mutableShopList.observe(this, Observer {
            Log.d(TAG, "initViewModel: $it")
        })
    }
}