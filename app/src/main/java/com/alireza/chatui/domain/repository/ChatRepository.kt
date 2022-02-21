package com.alireza.chatui.domain.repository

import com.alireza.chatui.data.Resource
import com.alireza.chatui.data.dto.Message

interface ChatRepository {

    suspend fun sendMessage(message: Message): Resource<Boolean>

    suspend fun getAllMessages(): Resource<List<Message>>

    suspend fun getMessagePerPage(page: Int): Resource<List<Message>>
}