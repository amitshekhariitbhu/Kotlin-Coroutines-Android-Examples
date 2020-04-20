package com.mindorks.example.coroutines.data.api

class ApiHelper(private val apiService: ApiService) {

    suspend fun getUsers() = apiService.getUsers()

    suspend fun getMoreUsers() = apiService.getMoreUsers()

}