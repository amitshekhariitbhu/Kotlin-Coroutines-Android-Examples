package com.mindorks.example.coroutines.learn.task.twotasks

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mindorks.example.coroutines.data.api.ApiHelper
import com.mindorks.example.coroutines.data.local.DatabaseHelper
import com.mindorks.example.coroutines.utils.Resource
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class TwoLongRunningTasksViewModel(
    private val apiHelper: ApiHelper,
    private val dbHelper: DatabaseHelper
) : ViewModel() {

    private val status = MutableLiveData<Resource<String>>()

    fun startLongRunningTask() {
        viewModelScope.launch {
            status.postValue(Resource.loading(null))
            try {
                // do long running tasks
                val resultOneDeferred = async { doLongRunningTaskOne() }
                val resultTwoDeferred = async { doLongRunningTaskTwo() }
                val combinedResult = resultOneDeferred.await() + resultTwoDeferred.await()

                status.postValue(Resource.success("Task Completed : $combinedResult"))
            } catch (e: Exception) {
                status.postValue(Resource.error("Something Went Wrong", null))
            }
        }
    }

    fun getStatus(): LiveData<Resource<String>> {
        return status
    }

    private suspend fun doLongRunningTaskOne(): String {
        delay(5000)
        return "One"
    }

    private suspend fun doLongRunningTaskTwo(): String {
        delay(5000)
        return "Two"
    }

}