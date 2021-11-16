package com.smg.retrofitxmlparser.api

import android.util.Log
import com.tickaroo.tikxml.TikXml
import com.tickaroo.tikxml.retrofit.TikXmlConverterFactory
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.*

object Retrofit {


    private const val BASE_URL = "http://ws.bus.go.kr/"

    fun getRetrofit() : Service {
        val logger = HttpLoggingInterceptor { Log.d("API", it) }
        logger.level = HttpLoggingInterceptor.Level.BASIC

        val parser = TikXml.Builder().addTypeConverter(Date::class.java, MyDateConverter())
            .exceptionOnUnreadXml(false).build()

        val client = OkHttpClient.Builder()
            .addInterceptor(logger)
            .build()
        return Retrofit.Builder()
            .baseUrl(BASE_URL.toHttpUrlOrNull()!!)
            .client(client)
            .addConverterFactory(TikXmlConverterFactory.create(parser))
            .build()
            .create(Service::class.java)


    }
}