package com.alireza.chatui.domain.usercases.errors
import com.alireza.chatui.data.error.Error


interface ErrorUseCase {
    fun getError(errorCode: Int): Error
}