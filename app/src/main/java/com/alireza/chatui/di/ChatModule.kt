package com.alireza.chatui.di

import com.alireza.chatui.data.repository.ChatRepositoryImpl
import com.alireza.chatui.domain.repository.ChatRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ChatModule {

    @Provides
    @Singleton
    fun provideChatRepo(): ChatRepository {
        return ChatRepositoryImpl()
    }
}