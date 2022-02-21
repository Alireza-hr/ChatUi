package com.alireza.chatui.domain.usercases.errors

import com.alireza.chatui.data.error.mapper.ErrorMapper
import javax.inject.Inject
import com.alireza.chatui.data.error.Error

class ErrorManager @Inject constructor(private val errorMapper: ErrorMapper) : ErrorUseCase {
    override fun getError(errorCode: Int): Error {
        return Error(code = errorCode, description = errorMapper.errorsMap.getValue(errorCode))
    }
}