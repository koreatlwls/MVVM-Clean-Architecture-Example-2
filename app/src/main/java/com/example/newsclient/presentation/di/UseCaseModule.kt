package com.example.newsclient.presentation.di

import com.example.newsclient.domain.repository.NewsRepository
import com.example.newsclient.domain.usecase.GetNewsHeadlinesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Singleton
    @Provides
    fun provideNewsHeadLinesUseCase(newsRepository: NewsRepository):GetNewsHeadlinesUseCase{
        return GetNewsHeadlinesUseCase(newsRepository)
    }

}