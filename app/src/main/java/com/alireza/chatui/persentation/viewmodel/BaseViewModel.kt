package com.alireza.chatui.persentation.viewmodel

import androidx.lifecycle.ViewModel
import com.alireza.chatui.domain.usercases.errors.ErrorManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

open class BaseViewModel :ViewModel(){
    @Inject
    lateinit var errorManager: ErrorManager
}