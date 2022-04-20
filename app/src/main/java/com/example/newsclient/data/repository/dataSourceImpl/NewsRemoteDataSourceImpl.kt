package com.example.newsclient.data.repository.dataSourceImpl

import com.example.newsclient.data.api.NewsAPIService
import com.example.newsclient.data.model.APIResponse
import com.example.newsclient.data.repository.dataSource.NewsRemoteDataSource
import com.example.newsclient.data.util.Resource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService
) : NewsRemoteDataSource {

    override suspend fun getTopHeadlines(country : String, page:Int): Response<APIResponse> {
        return newsAPIService.getTopHeadlines(country, page)
    }

    override suspend fun getSearchedNews(
        searchQuery: String,
        country: String,
        page: Int
    ): Response<APIResponse> {
        return newsAPIService.getSearchedTopHeadLines(searchQuery, country, page)
    }

}