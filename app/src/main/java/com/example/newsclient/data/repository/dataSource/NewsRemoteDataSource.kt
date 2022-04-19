package com.example.newsclient.data.repository.dataSource

import com.example.newsclient.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines():Response<APIResponse>
}