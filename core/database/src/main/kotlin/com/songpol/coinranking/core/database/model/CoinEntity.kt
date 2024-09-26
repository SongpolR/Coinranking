package com.songpol.coinranking.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.songpol.coinranking.core.model.coin.CoinId
import com.songpol.coinranking.core.model.coin.CoinSymbol

@Entity(
    tableName = "coins",
)
data class CoinEntity(
    @PrimaryKey
    val id: CoinId,
    val rank: Int,
    val symbol: CoinSymbol,
    @ColumnInfo(name = "icon_url")
    val iconUrl: String,
    @ColumnInfo(name = "market_cap")
    val marketCap: String,
    val price: String,
    val change: String,
    val sparkline: List<String>
)