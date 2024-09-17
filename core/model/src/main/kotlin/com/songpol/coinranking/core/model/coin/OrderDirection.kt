package com.songpol.coinranking.core.model.coin

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// asc, desc
@Serializable
enum class ListingOrderDirection {
    @SerialName("asc")
    ASC,

    @SerialName("desc")
    DESC,
}