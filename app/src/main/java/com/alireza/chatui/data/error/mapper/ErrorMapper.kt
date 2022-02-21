package com.alireza.chatui.data.error.mapper

import android.content.Context
import com.alireza.chatui.R
import com.alireza.chatui.data.error.*
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class ErrorMapper @Inject constructor(@ApplicationContext val context: Context) :
    ErrorMapperSource {

    override fun getErrorString(errorId: Int): String {
        return context.getString(errorId)
    }

    override val errorsMap: Map<Int, String>
        get() = mapOf(
            Pair(UNEXPECTED_ERROR, getErrorString(R.string.unexpected_error)),
        ).withDefault { getErrorString(R.string.unexpected_error) }
}