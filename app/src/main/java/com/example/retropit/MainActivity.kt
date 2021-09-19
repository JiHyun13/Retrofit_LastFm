package com.example.retropit

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.retropit.Data.Data
import com.example.retropit.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val api = Client.getApiService()
        api!!.getApi("chart.gettoptracks","563f17153e9c60240d5e29bb1a508549","json").enqueue(object : Callback<Data>{
            override fun onResponse(call: Call<Data>, response: Response<Data>) {
                if(response.isSuccessful){
                    val result = response.body() //.body()써야함
                    Log.d(TAG, "onResponse: 가나다 $result")
                    binding.rv.adapter = MyAdapter(result!!.tracks.track)
                }
            }

            override fun onFailure(call: Call<Data>, t: Throwable) {
                t.printStackTrace()
            }

        })



    }

}