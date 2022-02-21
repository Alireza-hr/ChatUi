package com.alireza.chatui.data.error


const val DEFAULT_ERROR = 0
const val UNEXPECTED_ERROR = 1

class Error(private val code: Int, private val description: String) {
    constructor(exception: Exception) : this(
        code = DEFAULT_ERROR, description = exception.message
            ?: ""
    )
}

