package com.example.retropit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


object Client {
    private const val baseurl = "https://ws.audioscrobbler.com/"
    fun getApiService() : ApiService? = instance?.create(ApiService::class.java)

    private var instance : Retrofit? = Retrofit.Builder()
        .baseUrl(baseurl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


}