package com.project.greenmind.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object testImpl {
    private const val BASE_URL = ""

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val testService1: testRequest1 = retrofit.create(testRequest1::class.java)
    val testService2: testRequest2 = retrofit.create(testRequest2::class.java)
}