package com.songpol.coinranking.core.model.coin

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoinListItem(
    @SerialName("uuid") val id: CoinId,
)