package com.songpol.coinranking.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.songpol.coinranking.core.database.dao.CoinDao
import com.songpol.coinranking.core.database.model.CoinEntity
import com.songpol.coinranking.core.database.util.ListOfStringTypeConverter

@Database(
    entities = [
        CoinEntity::class,
    ],
    version = 1,
    autoMigrations = [],
    exportSchema = true,
)

@TypeConverters(
    ListOfStringTypeConverter::class
)
internal abstract class CoinrankingDatabase : RoomDatabase() {
    abstract fun coinDao(): CoinDao
}