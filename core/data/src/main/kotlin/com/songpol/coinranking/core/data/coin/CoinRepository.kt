package com.songpol.coinranking.core.data.coin

import androidx.paging.PagingData
import com.songpol.coinranking.core.model.coin.Coin
import com.songpol.coinranking.core.network.datasource.coin.CoinNetworkDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import javax.inject.Inject

interface CoinRepository {
    fun getCoins(): Flow<PagingData<Coin>>
}

class CoinRepositoryImpl @Inject constructor(
    private val coinNetworkDataSource: CoinNetworkDataSource
):  CoinRepository{

    override fun getCoins(): Flow<PagingData<Coin>> {
        return emptyFlow()
    }
}