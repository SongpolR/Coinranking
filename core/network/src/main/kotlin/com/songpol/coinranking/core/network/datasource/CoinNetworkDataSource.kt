package com.songpol.coinranking.core.network.datasource

import com.songpol.coinranking.core.network.model.coin.CoinsResponse
import com.songpol.coinranking.core.network.service.coin.CoinService

interface CoinNetworkDataSource {
    suspend fun getCoins(): List<CoinsResponse>
}

class CoinNetworkDataSourceImpl(
    private val coinService: CoinService
):CoinNetworkDataSource {

    override suspend fun getCoins(): List<CoinsResponse> {
        return listOf() // TODO
    }
}