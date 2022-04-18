package com.example.newsclient.data.util

sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T) : Resource<T>(data)
    class Loading<T>(data: T) : Resource<T>(data)
    class Error<T>(data: T) : Resource<T>(data)
}