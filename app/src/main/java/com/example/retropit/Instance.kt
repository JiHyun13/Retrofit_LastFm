package com.example.retropit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object Instance {
    private const val baseurl = "https://www.last.fm/api/show/chart.getTopTracks"
    fun getApiService() : ApiService? = instance?.create(ApiService::class.java)

    private var instance : Retrofit? = Retrofit.Builder()
        .baseUrl(baseurl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()



}