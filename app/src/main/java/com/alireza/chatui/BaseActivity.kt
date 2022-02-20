package com.alireza.chatui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding>(private val bindingFactory: (LayoutInflater) -> VB) :
    AppCompatActivity() {

    protected val binding: VB by lazy { bindingFactory(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        onActivityCreated(savedInstanceState)
    }

    abstract fun onActivityCreated(savedInstanceState: Bundle?) }