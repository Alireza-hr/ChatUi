package com.alireza.chatui.di

import com.alireza.chatui.data.repository.ChatRepositoryImpl
import com.alireza.chatui.domain.repository.ChatRepository
import com.alireza.chatui.domain.usercases.UseCase
import com.alireza.chatui.domain.usercases.chatroom.SendChatMessageUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object UserCaseModule {
    @Singleton
    @Provides
    public fun provideUseCases(chatRepository: ChatRepository): UseCase {
        return UseCase(SendChatMessageUseCase(chatRepository))
    }
}