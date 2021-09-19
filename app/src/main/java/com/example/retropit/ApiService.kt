package com.example.retropit

import com.example.retropit.Data.Data
import com.example.retropit.Data.Track
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {

    @GET("/2.0/")
    fun getApi(@Query("method") method : String,
               @Query("api_key") api_key : String,
               @Query("format") format : String) : Call<Data>

}




