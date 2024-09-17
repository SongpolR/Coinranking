package com.songpol.coinranking.core.model.coin

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// price, marketCap, 24hVolume, change, listedAt
@Serializable
enum class ListingOrderAttribute {
    @SerialName("price")
    PRICE,

    @SerialName("marketCap")
    MARKET_CAP,

    @SerialName("24hVolume")
    DAILY_VOLUME,

    @SerialName("change")
    CHANGE,

    @SerialName("listedAt")
    LISTED_AT,
}