package com.songpol.coinranking.core.database.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.songpol.coinranking.core.database.model.CoinEntity
import com.songpol.coinranking.core.model.coin.CoinId
import kotlinx.coroutines.flow.Flow

@Dao
interface CoinDao {
    @Query(
        value = """
        SELECT * FROM coins
    """,
    )
    fun getCoins(): Flow<List<CoinEntity>>

    @Query(
        value = """
        SELECT * FROM coins
        WHERE id = :coinId
        LIMIT 1
    """,
    )
    fun getCoin(coinId: CoinId): Flow<CoinEntity>

    @Upsert
    suspend fun upsertCoins(coinEntities: List<CoinEntity>)
}