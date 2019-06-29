package com.guess.hk.testl.view

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.guess.hk.testl.R
import com.guess.hk.testl.viewmodel.InfoViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = ViewModelProviders.of(this).get(InfoViewModel::class.java)
        viewModel.loadData()



    }
}
