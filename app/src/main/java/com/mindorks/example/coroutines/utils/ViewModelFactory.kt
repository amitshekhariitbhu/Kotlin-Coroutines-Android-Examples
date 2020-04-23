package com.mindorks.example.coroutines.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mindorks.example.coroutines.data.api.ApiHelper
import com.mindorks.example.coroutines.data.local.DatabaseHelper
import com.mindorks.example.coroutines.learn.errorhandling.exceptionhandler.ExceptionHandlerViewModel
import com.mindorks.example.coroutines.learn.errorhandling.supervisor.IgnoreErrorAndContinueViewModel
import com.mindorks.example.coroutines.learn.errorhandling.trycatch.TryCatchViewModel
import com.mindorks.example.coroutines.learn.retrofit.parallel.ParallelNetworkCallsViewModel
import com.mindorks.example.coroutines.learn.retrofit.series.SeriesNetworkCallsViewModel
import com.mindorks.example.coroutines.learn.retrofit.single.SingleNetworkCallViewModel
import com.mindorks.example.coroutines.learn.room.RoomDBViewModel
import com.mindorks.example.coroutines.learn.task.onetask.LongRunningTaskViewModel
import com.mindorks.example.coroutines.learn.task.twotasks.TwoLongRunningTasksViewModel
import com.mindorks.example.coroutines.learn.timeout.TimeoutViewModel

class ViewModelFactory(private val apiHelper: ApiHelper, private val dbHelper: DatabaseHelper) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SingleNetworkCallViewModel::class.java)) {
            return SingleNetworkCallViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(SeriesNetworkCallsViewModel::class.java)) {
            return SeriesNetworkCallsViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(ParallelNetworkCallsViewModel::class.java)) {
            return ParallelNetworkCallsViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(RoomDBViewModel::class.java)) {
            return RoomDBViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(TimeoutViewModel::class.java)) {
            return TimeoutViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(TryCatchViewModel::class.java)) {
            return TryCatchViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(ExceptionHandlerViewModel::class.java)) {
            return ExceptionHandlerViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(LongRunningTaskViewModel::class.java)) {
            return LongRunningTaskViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(TwoLongRunningTasksViewModel::class.java)) {
            return TwoLongRunningTasksViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(IgnoreErrorAndContinueViewModel::class.java)) {
            return IgnoreErrorAndContinueViewModel(apiHelper, dbHelper) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}