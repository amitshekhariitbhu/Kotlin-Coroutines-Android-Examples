package com.mindorks.example.coroutines.data.local

import com.mindorks.example.coroutines.data.local.entity.User

class DatabaseHelper(private val appDatabase: AppDatabase) {

    suspend fun getUsers(): List<User> = appDatabase.userDao().getAll()

    suspend fun insertAll(users: List<User>) = appDatabase.userDao().insertAll(users)

}