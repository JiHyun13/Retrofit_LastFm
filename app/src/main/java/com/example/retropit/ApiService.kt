package com.example.retropit

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {

    @GET("/ws.audioscrobbler.com/2.0/?method=chart.gettoptracks")
    fun getApi(@Query("563f17153e9c60240d5e29bb1a508549") api : String,
               @Query("json") type : String)

    /*@GET("Track")
    fun getTrackFilter(
        @Query("artist") artist: Artist,
        @Query("name") name: String
    )

    @GET("Artist")
    fun getArtistFilter(
        @Query("name") artistName : String
    )

    @POST("Track")
    fun setTrack(@Body Data: Track) : Call<Track>

    @POST("Artist")
    fun setArtist(@Body Data2 : Artist) : Call<Artist>*/

}




