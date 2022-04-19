package com.example.newsclient.data.repository.dataSourceImpl

import com.example.newsclient.data.api.NewsAPIService
import com.example.newsclient.data.model.APIResponse
import com.example.newsclient.data.repository.dataSource.NewsRemoteDataSource
import com.example.newsclient.data.util.Resource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,
    private val country: String,
    private val page: Int
) : NewsRemoteDataSource {

    override suspend fun getTopHeadlines(): Response<APIResponse> {
        return newsAPIService.getTopHeadlines(country, page)
    }

}