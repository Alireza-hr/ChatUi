package com.alireza.chatui.domain.usercases.chatroom

import com.alireza.chatui.data.Resource
import com.alireza.chatui.data.dto.Message
import com.alireza.chatui.domain.repository.ChatRepository
import javax.inject.Inject

class SendChatMessageUseCase @Inject constructor(private val chatRepository: ChatRepository) {
    suspend operator fun invoke(message: Message): Resource<Boolean> = chatRepository.sendMessage(message)
}