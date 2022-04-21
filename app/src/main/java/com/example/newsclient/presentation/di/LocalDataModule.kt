package com.example.newsclient.presentation.di

import com.example.newsclient.data.db.ArticleDAO
import com.example.newsclient.data.repository.dataSource.NewsLocalDataSource
import com.example.newsclient.data.repository.dataSourceImpl.NewsLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {

    @Singleton
    @Provides
    fun provideLocalDataSource(articleDAO: ArticleDAO) : NewsLocalDataSource{
        return NewsLocalDataSourceImpl(articleDAO)
    }

}