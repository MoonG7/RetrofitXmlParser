package com.smg.retrofitxmlparser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.smg.retrofitxmlparser.api.data.BusRouteInfo
import com.smg.retrofitxmlparser.api.Retrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //key 키입력
        val key = ""

        var call : Call<BusRouteInfo> = Retrofit.getRetrofit().busRouteInfo(key,5516)

        call.enqueue(object : Callback<BusRouteInfo> {
            override fun onResponse(call: Call<BusRouteInfo>, response: Response<BusRouteInfo>) {
                val busRouteInfo : BusRouteInfo? = response.body()
                val itemList = busRouteInfo?.msgBody?.items?.get(0)
                Log.i("busRoute","itemList = ${itemList.toString()}")
            }

            override fun onFailure(call: Call<BusRouteInfo>, t: Throwable) {
                Log.i("busRoute","onFailure t = ${t.message}")

            }

        })

    }
}