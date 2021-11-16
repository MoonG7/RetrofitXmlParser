package com.smg.retrofitxmlparser.api

import com.smg.retrofitxmlparser.api.data.BusRouteInfo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {

    @GET("api/rest/busRouteInfo/getBusRouteList")
    fun busRouteInfo(
        @Query("serviceKey" ,encoded = true) serviceKey: String,
        @Query("strSrch") strSrch: Int
    ): Call<BusRouteInfo>

}