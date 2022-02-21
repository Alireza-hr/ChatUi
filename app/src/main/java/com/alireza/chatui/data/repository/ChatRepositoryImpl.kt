package com.alireza.chatui.data.repository

import com.alireza.chatui.data.Resource
import com.alireza.chatui.data.dto.Message
import com.alireza.chatui.domain.repository.ChatRepository

class ChatRepositoryImpl : ChatRepository {
    override suspend fun sendMessage(message: Message): Resource<Boolean> {
        return Resource.Success(true)
    }

    override suspend fun getAllMessages(): Resource<List<Message>> {
        return Resource.Success(mutableListOf(Message()))
    }

    override suspend fun getMessagePerPage(page: Int): Resource<List<Message>> {
        return Resource.Success(mutableListOf(Message()))
    }
}