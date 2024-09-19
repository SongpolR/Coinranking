package com.songpol.coinranking.core.model.coin

data class CoinListItem(
    val id: CoinId,
    val rank: Int,
    val symbol: CoinSymbol,
    val iconUrl: String,
    val marketCap: String,
    val price: String,
    val change: String,
    val sparkline: List<String>
)