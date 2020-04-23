package com.mindorks.example.coroutines.learn.task.onetask

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mindorks.example.coroutines.data.api.ApiHelper
import com.mindorks.example.coroutines.data.local.DatabaseHelper
import com.mindorks.example.coroutines.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LongRunningTaskViewModel(
    private val apiHelper: ApiHelper,
    private val dbHelper: DatabaseHelper
) : ViewModel() {

    private val status = MutableLiveData<Resource<String>>()

    fun startLongRunningTask() {
        viewModelScope.launch {
            status.postValue(Resource.loading(null))
            try {
                // do a long running task
                doLongRunningTask()
                status.postValue(Resource.success("Task Completed"))
            } catch (e: Exception) {
                status.postValue(Resource.error("Something Went Wrong", null))
            }
        }
    }

    fun getStatus(): LiveData<Resource<String>> {
        return status
    }

    private suspend fun doLongRunningTask() {
        withContext(Dispatchers.Default) {
            // your code for doing a long running task
            // Added delay to simulate
            delay(5000)
        }
    }

}