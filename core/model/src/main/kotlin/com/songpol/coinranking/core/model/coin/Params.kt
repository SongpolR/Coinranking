package com.songpol.coinranking.core.model.coin

data class CoinListParams(
    val refCurrencyId: CoinId,
    val timePeriod: InfoTimePeriod,
    val orderBy: ListingOrderAttribute,
    val orderDirection: ListingOrderDirection,
    val limit: Int,
    val offset: Int
)