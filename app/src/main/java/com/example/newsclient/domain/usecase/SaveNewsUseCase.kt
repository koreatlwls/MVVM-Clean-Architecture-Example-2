package com.example.newsclient.domain.usecase

import com.example.newsclient.data.model.Article
import com.example.newsclient.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(article : Article) = newsRepository.savedNews(article)

}