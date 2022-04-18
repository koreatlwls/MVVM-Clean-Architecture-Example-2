package com.example.newsclient.domain.usecase

import com.example.newsclient.data.model.APIResponse
import com.example.newsclient.data.util.Resource
import com.example.newsclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(searchQuery : String): Resource<APIResponse>{
        return newsRepository.getSearchedNews(searchQuery)
    }

}