package com.alireza.chatui

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {
    var isLoading = ObservableField(false)
}