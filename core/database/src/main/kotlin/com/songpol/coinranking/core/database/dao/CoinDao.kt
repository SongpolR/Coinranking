package com.songpol.coinranking.core.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.songpol.coinranking.core.database.model.CoinEntity
import com.songpol.coinranking.core.model.coin.CoinId
import kotlinx.coroutines.flow.Flow

@Dao
interface CoinDao {
    @Query(
        value = """
        SELECT * FROM coins
        WHERE id = :coinId
    """,
    )
    fun getCoins(coinId: CoinId): Flow<List<CoinEntity>>
}