package com.songpol.coinranking.core.data.di

import com.songpol.coinranking.core.data.coin.CoinRepository
import com.songpol.coinranking.core.data.coin.CoinRepositoryImpl
import com.songpol.coinranking.core.network.datasource.CoinNetworkDataSource
import com.songpol.coinranking.core.network.datasource.CoinNetworkDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DataModule {

    @Binds
    @Singleton
    abstract fun bindCoinRepository(
        coinRepositoryImpl: CoinRepositoryImpl,
    ): CoinRepository
}