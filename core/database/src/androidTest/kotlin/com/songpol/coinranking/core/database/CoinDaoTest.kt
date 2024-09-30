package com.songpol.coinranking.core.database

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.songpol.coinranking.core.database.dao.CoinDao
import com.songpol.coinranking.core.database.model.CoinEntity
import com.songpol.coinranking.core.database.model.asExternalModel
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CoinDaoTest {

    private lateinit var coinDao: CoinDao
    private lateinit var databse: CoinrankingDatabase

    @Before
    fun createDatabase() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        databse = Room.inMemoryDatabaseBuilder(
            context,
            CoinrankingDatabase::class.java,
        ).build()
        coinDao = databse.coinDao()
    }

    @After
    fun closeDb() = databse.close()

    @Test
    fun coinDao_fetches_items_by_ascending_rank() = runTest {
        val coinEntities = listOf(
            testCoin(
                id = "0",
                rank = 1,
            ),
            testCoin(
                id = "1",
                rank = 2,
            ),
            testCoin(
                id = "2",
                rank = 3,
            ),
            testCoin(
                id = "3",
                rank = 4,
            ),
        )
        coinDao.upsertCoins(
            coinEntities,
        )

        val savedCoinEntities = coinDao.getCoins()
            .first()

        assertEquals(
            listOf(1, 2, 3, 4),
            savedCoinEntities.map {
                it.asExternalModel().rank
            },
        )
    }
}

private fun testCoin(
    id: String = "0",
    rank: Int = 1,
) = CoinEntity(
    id = id,
    rank = rank,
    symbol = "",
    iconUrl = "",
    marketCap = "",
    price = "",
    change = "",
    sparkline = listOf(),
)