package com.songpol.coinranking.core.data.coin

import androidx.paging.PagingData
import com.songpol.coinranking.core.model.coin.CoinListItem
import com.songpol.coinranking.core.network.datasource.CoinNetworkDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import javax.inject.Inject

interface CoinRepository {
    fun getCoinList(): Flow<PagingData<CoinListItem>>
}

class CoinRepositoryImpl @Inject constructor(
    private val coinNetworkDataSource: CoinNetworkDataSource
):  CoinRepository{

    override fun getCoinList(): Flow<PagingData<CoinListItem>> {
        return emptyFlow()
    }
}