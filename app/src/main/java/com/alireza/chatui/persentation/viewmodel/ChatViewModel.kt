package com.alireza.chatui.persentation.viewmodel

import android.util.Log
import com.alireza.chatui.data.dto.Message
import com.alireza.chatui.domain.usercases.UseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
public class ChatViewModel @Inject constructor(private val useCase: UseCase) : BaseViewModel() {

}