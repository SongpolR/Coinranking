package com.songpol.coinranking.core.network.datasource.coin

import com.songpol.coinranking.core.model.coin.CoinListParams
import com.songpol.coinranking.core.network.model.coin.CoinListResponse
import com.songpol.coinranking.core.network.service.coin.CoinService
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

interface CoinNetworkDataSource {
    suspend fun getCoins(params: CoinListParams): List<CoinListResponse.Coin>
}

class CoinNetworkDataSourceImpl(
    private val coinService: CoinService,
    private val ioDispatcher: CoroutineDispatcher,
) : CoinNetworkDataSource {

    override suspend fun getCoins(params: CoinListParams): List<CoinListResponse.Coin> =
        withContext(ioDispatcher) {
            coinService.getCoinList(
                refCurrencyId = params.refCurrencyId,
                timePeriod = params.timePeriod,
                orderBy = params.orderBy,
                orderDirection = params.orderDirection,
                limit = params.limit,
                offset = params.offset
            ).data.coins
        }
}