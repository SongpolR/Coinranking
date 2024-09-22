package com.songpol.coinranking.core.network.di

import androidx.tracing.trace
import com.songpol.coinranking.core.network.BuildConfig
import com.songpol.coinranking.core.network.datasource.CoinNetworkDataSource
import com.songpol.coinranking.core.network.datasource.CoinNetworkDataSourceImpl
import com.songpol.coinranking.core.network.service.coin.CoinService
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.Call
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class NetworkModule {

    @Binds
    @Singleton
    abstract fun bindCoinNetworkDataSource(
        coinNetworkDataSourceImpl: CoinNetworkDataSourceImpl,
    ): CoinNetworkDataSource

    companion object {

        @Provides
        @Singleton
        fun providesNetworkJson(): Json = Json {
            ignoreUnknownKeys = true
        }

        @Provides
        @Singleton
        fun okHttpCallFactory(): Call.Factory = trace("OkHttpClient") {
            OkHttpClient.Builder()
                .addInterceptor(
                    HttpLoggingInterceptor()
                        .apply {
                            if (BuildConfig.DEBUG) {
                                setLevel(HttpLoggingInterceptor.Level.BODY)
                            }
                        },
                )
                .build()
        }

        @Provides
        @Singleton
        fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(BuildConfig.API_KEY)
                .build()
        }

        @Provides
        @Singleton
        fun provideCoinService(retrofit: Retrofit): CoinService {
            return retrofit.create(CoinService::class.java)
        }
    }
}