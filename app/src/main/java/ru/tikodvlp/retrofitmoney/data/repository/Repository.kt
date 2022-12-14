package ru.tikodvlp.retrofitmoney.data.repository

import retrofit2.Response
import ru.tikodvlp.retrofitmoney.data.api.RetrofitInstance
import ru.tikodvlp.retrofitmoney.model.cachless.CashlessItem
import ru.tikodvlp.retrofitmoney.model.cash.CashItem

class Repository {

    suspend fun getCash(): Response<CashItem> {
        return RetrofitInstance.api.getCashMoney()
    }

    suspend fun getCashless(): Response<CashlessItem> {
        return RetrofitInstance.api.getCashlessMoney()
    }
}