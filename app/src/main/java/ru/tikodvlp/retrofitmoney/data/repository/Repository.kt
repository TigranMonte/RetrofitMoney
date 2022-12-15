package ru.tikodvlp.retrofitmoney.data.repository

import retrofit2.Response
import ru.tikodvlp.retrofitmoney.data.api.RetrofitInstance
import ru.tikodvlp.retrofitmoney.model.cachless.Cashless
import ru.tikodvlp.retrofitmoney.model.cachless.CashlessItem
import ru.tikodvlp.retrofitmoney.model.cash.Cash

class Repository {

    suspend fun getCash(): Response<Cash> {
        return RetrofitInstance.api.getCashMoney()
    }

    suspend fun getCashless(): Response<Cashless> {
        return RetrofitInstance.api.getCashlessMoney()
    }
}