package ru.tikodvlp.retrofitmoney.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    // создали инстанс ретрофита
    private val retrofit by lazy {
        Retrofit.Builder().baseUrl("https://api.privatbank.ua/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    // соединили с аписервисом, откуда будет брать эндпойнты
    val api:ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}