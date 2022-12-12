package ru.tikodvlp.retrofitmoney.model.cachless

data class CashlessItem(
    val base_ccy: String,
    val buy: String,
    val ccy: String,
    val sale: String
)