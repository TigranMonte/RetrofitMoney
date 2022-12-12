package ru.tikodvlp.retrofitmoney.model.cash

data class CashItem(
    val base_ccy: String,
    val buy: String,
    val ccy: String,
    val sale: String
)