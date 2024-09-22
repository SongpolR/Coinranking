package com.songpol.coinranking.core.network.service.coin

import com.songpol.coinranking.core.model.coin.CoinId
import com.songpol.coinranking.core.model.coin.InfoTimePeriod
import com.songpol.coinranking.core.model.coin.ListingOrderAttribute
import com.songpol.coinranking.core.model.coin.ListingOrderDirection
import com.songpol.coinranking.core.network.model.NetworkResponse
import com.songpol.coinranking.core.network.model.coin.CoinsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CoinService {

    @GET("v2/coins")
    suspend fun getCoins(
        @Query("referenceCurrencyUuid") refCurrencyId: CoinId,
        @Query("timePeriod") timePeriod: InfoTimePeriod,
        @Query("orderBy") orderBy: ListingOrderAttribute,
        @Query("orderDirection") orderDirection: ListingOrderDirection,
        @Query("limit") limit: Int,
        @Query("offset") offset: Int,
    ): NetworkResponse<CoinsResponse>
}