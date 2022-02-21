package com.alireza.chatui.persentation.view

import android.os.Bundle
import com.alireza.chatui.R
import com.alireza.chatui.databinding.ActivityMainBinding
import com.alireza.chatui.persentation.view.basic.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
       supportFragmentManager.beginTransaction()
            .replace(R.id.container, ChatFragment()).commit()
    }
}