package com.alireza.chatui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import java.lang.reflect.ParameterizedType

abstract class BaseFragment<VDB : ViewDataBinding, VM : BaseViewModel>(@LayoutRes private val layoutResId: Int) :
    Fragment() {

    protected lateinit var binding: VDB

    protected val viewModel: VM by lazy {
        ViewModelProvider(this)[getViewModelClass()]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate<VDB>(
            inflater,
            layoutResId,
            container,
            false
        )

        onFragmentCreated(container, savedInstanceState)

        return binding.root
    }

    abstract fun onFragmentCreated(container: ViewGroup?, savedInstanceState: Bundle?)

    private fun getViewModelClass(): Class<VM> {
        val type = (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0]
        return type as Class<VM>
    }
}