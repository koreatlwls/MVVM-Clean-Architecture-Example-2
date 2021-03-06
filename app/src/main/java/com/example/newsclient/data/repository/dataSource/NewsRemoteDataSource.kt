package com.example.newsclient.data.repository.dataSource

import com.example.newsclient.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(country: String, page: Int): Response<APIResponse>
    suspend fun getSearchedNews(searchQuery:String, country: String, page: Int): Response<APIResponse>
}