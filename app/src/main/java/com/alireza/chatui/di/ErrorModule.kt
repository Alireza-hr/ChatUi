package com.alireza.chatui.di

import com.alireza.chatui.data.error.mapper.ErrorMapper
import com.alireza.chatui.data.error.mapper.ErrorMapperSource
import com.alireza.chatui.domain.repository.ChatRepository
import com.alireza.chatui.domain.usercases.UseCase
import com.alireza.chatui.domain.usercases.chatroom.SendChatMessageUseCase
import com.alireza.chatui.domain.usercases.errors.ErrorManager
import com.alireza.chatui.domain.usercases.errors.ErrorUseCase
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class ErrorModule {
    @Binds
    @Singleton
    abstract fun provideErrorFactoryImpl(errorManager: ErrorManager): ErrorUseCase

    @Binds
    @Singleton
    abstract fun provideErrorMapper(errorMapper: ErrorMapper): ErrorMapperSource
}