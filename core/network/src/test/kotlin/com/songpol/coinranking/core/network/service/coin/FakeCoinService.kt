package com.songpol.coinranking.core.network.service.coin

import com.songpol.coinranking.core.model.coin.CoinId
import com.songpol.coinranking.core.model.coin.InfoTimePeriod
import com.songpol.coinranking.core.model.coin.ListingOrderAttribute
import com.songpol.coinranking.core.model.coin.ListingOrderDirection
import com.songpol.coinranking.core.network.model.NetworkResponse
import com.songpol.coinranking.core.network.model.coin.CoinListResponse
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream

class FakeCoinService : CoinService {

    private val networkJson: Json = Json {
        ignoreUnknownKeys = true
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun getCoinList(
        refCurrencyId: CoinId,
        timePeriod: InfoTimePeriod,
        orderBy: ListingOrderAttribute,
        orderDirection: ListingOrderDirection,
        limit: Int,
        offset: Int
    ): NetworkResponse<CoinListResponse> {
        return LocalAssetManager.open("coin_list_response.json")
            .use(networkJson::decodeFromStream)
    }
}