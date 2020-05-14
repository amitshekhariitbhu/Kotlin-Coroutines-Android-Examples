<img src=https://raw.githubusercontent.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/master/assets/banner-kotlin-coroutines.jpg >

# Kotlin-Coroutines-Android-Examples - Learn Kotlin Coroutines for Android by Examples

[![MindOrks](https://img.shields.io/badge/mindorks-opensource-blue.svg)](https://mindorks.com/open-source-projects)
[![MindOrks Community](https://img.shields.io/badge/join-community-blue.svg)](https://mindorks.com/join-community)
[![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=102)](https://opensource.org/licenses/Apache-2.0)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/LICENSE)

## About this project: 
* If you want to get started with Kotlin Coroutines for Android Development and wants to master it, then this project is for you.
* Common use-cases of Kotlin Coroutines in Android has been implemented in this project.
* Also, learn to write Unit-Test for ViewModel which uses Kotlin Coroutines.
* This is your one-stop solution for learning Kotlin Coroutines for Android Development.

## Steps to learn Kotlin Coroutines by examples from this project
* First, learn the concepts of Kotlin Coroutines from this **[blog](https://blog.mindorks.com/mastering-kotlin-coroutines-in-android-step-by-step-guide)**
* Then, just clone, build, run the project and start learning Kotlin Coroutines by examples.

## This Kotlin Coroutines Example Project will help you in learning the following for Android App Development:
* What are Kotlin Coroutines?
* How to use Kotlin Coroutines in Android App Development?
* Step by step guide on how to implement the Kotlin Coroutines in Android.
* Doing simple task in background using Kotlin Coroutines.
* Doing tasks in series using Kotlin Coroutines.
* Doing tasks in parallel using Kotlin Coroutines.
* Making two network calls in parallel using Kotlin Coroutines.
* What are scopes in Kotlin Coroutines?
* Canceling background task using Kotlin Coroutines.
* Exception handling in Kotlin Coroutines.
* Using Kotlin Coroutines with Retrofit.
* Using Kotlin Coroutines with Room Database.
* Using Kotlin Coroutines with various 3rd party libraries.
* Adding timeout to a task using Kotlin Coroutines.
* Writing Unit-Test for ViewModel which uses Kotlin Coroutines.

## Kotlin Coroutines Examples for Android Development:
* **Single Network Call:** Learn how to make a network call using Kotlin Coroutines. This is a very simple use-case in Android App Development.
    * [Activity Code](app/src/main/java/com/mindorks/example/coroutines/learn/retrofit/single/SingleNetworkCallActivity.kt)
    * [ViewModel Code](app/src/main/java/com/mindorks/example/coroutines/learn/retrofit/single/SingleNetworkCallViewModel.kt)
 
* **Series Network Calls:** Learn how to make network calls in series using Kotlin Coroutines. This is useful when you want to make a network call which is dependent on an another network call.
    * [Activity Code](app/src/main/java/com/mindorks/example/coroutines/learn/retrofit/series/SeriesNetworkCallsActivity.kt)
    * [ViewModel Code](app/src/main/java/com/mindorks/example/coroutines/learn/retrofit/series/SeriesNetworkCallsViewModel.kt)
    
* **Parallel Network Calls:** Learn how to make network calls in parallel using Kotlin Coroutines. This is useful when you want to make network calls in parallel which are independent of each other.
    * [Activity Code](app/src/main/java/com/mindorks/example/coroutines/learn/retrofit/parallel/ParallelNetworkCallsActivity.kt)
    * [ViewModel Code](app/src/main/java/com/mindorks/example/coroutines/learn/retrofit/parallel/ParallelNetworkCallsViewModel.kt)  
    
* **Room Database Operation:** Learn how to fetch or insert entity in database using Kotlin Coroutines. This is useful when you are using Room Database in your Android Application.
    * [Activity Code](app/src/main/java/com/mindorks/example/coroutines/learn/room/RoomDBActivity.kt)
    * [ViewModel Code](app/src/main/java/com/mindorks/example/coroutines/learn/room/RoomDBViewModel.kt) 

* **Long Running Task:** Learn how to do a long running task using Kotlin Coroutines. If you want to do any of your task in background thread using the Kotlin Coroutines, then this is useful.
    * [Activity Code](app/src/main/java/com/mindorks/example/coroutines/learn/task/onetask/LongRunningTaskActivity.kt)
    * [ViewModel Code](app/src/main/java/com/mindorks/example/coroutines/learn/task/onetask/LongRunningTaskViewModel.kt) 
    
* **Two Long Running Tasks:** Learn how to run two long running tasks in parallel using Kotlin Coroutines.
    * [Activity Code](app/src/main/java/com/mindorks/example/coroutines/learn/task/twotasks/TwoLongRunningTasksActivity.kt)
    * [ViewModel Code](app/src/main/java/com/mindorks/example/coroutines/learn/task/twotasks/TwoLongRunningTasksViewModel.kt)     

* **Timeout:** Learn how to add timeout to a task using Kotlin Coroutines. If you want to add a timeout to any of your background task in Android, this is going to super useful.
    * [Activity Code](app/src/main/java/com/mindorks/example/coroutines/learn/timeout/TimeoutActivity.kt)
    * [ViewModel Code](app/src/main/java/com/mindorks/example/coroutines/learn/timeout/TimeoutViewModel.kt) 
    
* **Try-Catch Error Handling:** Learn how to handle error in Kotlin Coroutines using Try-Catch.
    * [Activity Code](app/src/main/java/com/mindorks/example/coroutines/learn/errorhandling/trycatch/TryCatchActivity.kt)
    * [ViewModel Code](app/src/main/java/com/mindorks/example/coroutines/learn/errorhandling/trycatch/TryCatchViewModel.kt)    

* **CoroutineExceptionHandler:** Learn how to handle error in Kotlin Coroutines using CoroutineExceptionHandler.
    * [Activity Code](app/src/main/java/com/mindorks/example/coroutines/learn/errorhandling/exceptionhandler/ExceptionHandlerActivity.kt)
    * [ViewModel Code](app/src/main/java/com/mindorks/example/coroutines/learn/errorhandling/exceptionhandler/ExceptionHandlerViewModel.kt)      

* **Ignore Error And Continue:** Learn how to use `supervisorScope` to ignore error of a task and continue with other task. In other words, if more than two child jobs are running in parallel under a supervisor, one child job gets failed, we can continue with other.
    * [Activity Code](app/src/main/java/com/mindorks/example/coroutines/learn/errorhandling/supervisor/IgnoreErrorAndContinueActivity.kt)
    * [ViewModel Code](app/src/main/java/com/mindorks/example/coroutines/learn/errorhandling/supervisor/IgnoreErrorAndContinueViewModel.kt)   

* **Unit Test:** Learn how write unit-test for ViewModel which uses Kotlin Coroutines.
    * [ViewModelTest Code](app/src/test/java/com/mindorks/example/coroutines/learn/retrofit/single/SingleNetworkCallViewModelTest.kt)

## References useful during learning the Kotlin Coroutines for Android from this project
* [Mastering Kotlin Coroutines In Android - Step By Step Guide](https://blog.mindorks.com/mastering-kotlin-coroutines-in-android-step-by-step-guide)
* [What is suspend function in Kotlin Coroutines?](https://blog.mindorks.com/suspend-function-in-kotlin-coroutines)
* [Parallel Multiple Network Calls Using Kotlin Coroutines](https://blog.mindorks.com/parallel-multiple-network-calls-using-kotlin-coroutines)
* [Use ViewModelScope For Less Boilerplate Code With Coroutines](https://medium.com/mindorks/use-viewmodelscope-for-less-boilerplate-code-with-coroutines-79c7fa19aa8f)
* [Launch vs Async in Kotlin Coroutines](https://www.youtube.com/watch?v=nC30UiDv8Xc)
* [Kotlin withContext vs Async-await](https://blog.mindorks.com/kotlin-withcontext-vs-async-await)
* [Room Database with Kotlin Coroutines in Android](https://blog.mindorks.com/room-database-with-kotlin-coroutines-in-android)
* [Unit Testing ViewModel with Kotlin Coroutines and LiveData](https://blog.mindorks.com/unit-testing-viewmodel-with-kotlin-coroutines-and-livedata)
* [Exception Handling in Kotlin Coroutines](https://blog.mindorks.com/exception-handling-in-kotlin-coroutines)
* [Mockito cannot mock because : final class in Kotlin](https://blog.mindorks.com/mockito-cannot-mock-in-kotlin)
    
## The following project structure is followed for simplicity:
<p align="left">
    <img src="https://raw.githubusercontent.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/master/assets/project-structure-learn.png">
</p>
<br>

## Video showing how to get started with this project, [check here](https://www.youtube.com/watch?v=nKgvsZxyQs8)
<a href="https://www.youtube.com/watch?v=nKgvsZxyQs8" target="_blank">
<p align="center">
    <img src="https://raw.githubusercontent.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/master/assets/video-project-guide.png">
</p>
</a>

## Explore Android Online Tutorials and Courses To Learn More by MindOrks
* [Ride-Sharing Uber Lyft Android App](https://github.com/MindorksOpenSource/ridesharing-uber-lyft-app) - Learn to build a ride-sharing Android Taxi Clone App like Uber, Lyft - Open-Source Project By MindOrks
* [Android Tutorial](https://mindorks.com/android-tutorial) - All Free Android Tutorials by MindOrks
* [Android Online Course for Professionals](https://mindorks.com/android-app-development-online-course-for-professionals) - In this online course, you’ll learn the Dagger, Kotlin, RxJava, MVVM Architecture, Architecture Components, Jetpack, LiveData, ViewModel, Room Database, Database Design, Multithreading, Memory Management, Networking, Caching, How Glide works, Unit Testing, and the best practices for Android Development. By the end of this online course, you will have all the skills you need to become a professional Android Developer.
* [Android Online Course for Beginners](https://mindorks.com/android-app-development-online-course-for-beginners) - This course is for beginners for those who want to get started with Android Development. In this course, you will build two apps: TodoNotes and Ride-Sharing Uber Android App.          

## If this project helps you in anyway, show your love :heart: by putting a :star: on this project :v:

### Kotlin-Flow-Android-Examples - [Check here](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples)

[Check out MindOrks awesome open source projects here](https://mindorks.com/open-source-projects)

### License
```
   Copyright (C) 2020 MINDORKS NEXTGEN PRIVATE LIMITED

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```

### Contributing to Kotlin Coroutines Android Examples
Just make pull request. You are in!