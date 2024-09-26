package com.songpol.coinranking.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.songpol.coinranking.core.database.dao.CoinDao
import com.songpol.coinranking.core.database.model.CoinEntity

@Database(
    entities = [
        CoinEntity::class,
    ],
    version = 1,
    autoMigrations = [],
    exportSchema = true,
)

internal abstract class CoinrankingDatabase : RoomDatabase() {
    abstract fun coinDao(): CoinDao
}