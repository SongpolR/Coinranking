package com.songpol.coinranking.core.model.coin

typealias CoinId = String
typealias CoinSymbol = String

const val USD_COIN_ID = "yhjMzLPhuIDl"

data class Coin(
    val id: CoinId,
    val rank: Int,
    val symbol: CoinSymbol,
    val iconUrl: String,
    val marketCap: String,
    val price: String,
    val change: String,
    val sparkline: List<String>
)