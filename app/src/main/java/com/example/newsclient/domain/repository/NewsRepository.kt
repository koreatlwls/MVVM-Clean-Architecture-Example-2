package com.example.newsclient.domain.repository

import com.example.newsclient.data.model.APIResponse
import com.example.newsclient.data.model.Article
import com.example.newsclient.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun getNewsHeadlines(country : String, page:Int): Resource<APIResponse>
    suspend fun getSearchedNews(searchQuery: String, country: String, page: Int): Resource<APIResponse>
    suspend fun savedNews(article: Article)
    suspend fun deleteNews(article: Article)
    fun getSavedNews(): Flow<List<Article>>

}