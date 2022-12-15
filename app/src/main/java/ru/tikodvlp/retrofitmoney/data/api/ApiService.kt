package ru.tikodvlp.retrofitmoney.data.api

import retrofit2.Response
import retrofit2.http.GET
import ru.tikodvlp.retrofitmoney.model.cachless.Cashless
import ru.tikodvlp.retrofitmoney.model.cash.Cash

interface ApiService {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getCashMoney(): Response<Cash>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getCashlessMoney(): Response<Cashless>
}