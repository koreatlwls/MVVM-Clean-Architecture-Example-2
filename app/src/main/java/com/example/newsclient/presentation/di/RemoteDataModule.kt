package com.example.newsclient.presentation.di

import com.example.newsclient.data.api.NewsAPIService
import com.example.newsclient.data.repository.dataSource.NewsRemoteDataSource
import com.example.newsclient.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(newsAPIService: NewsAPIService) : NewsRemoteDataSource{
        return NewsRemoteDataSourceImpl(newsAPIService)
    }

}