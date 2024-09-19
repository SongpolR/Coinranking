package com.songpol.coinranking.core.model.coin

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

typealias CoinId = String
typealias CoinSymbol = String

const val USD_COIN_ID = "yhjMzLPhuIDl"

data class CoinDetail(
    val id: CoinId,
)