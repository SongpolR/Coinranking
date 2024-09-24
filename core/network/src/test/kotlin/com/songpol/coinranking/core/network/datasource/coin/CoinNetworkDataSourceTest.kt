package com.songpol.coinranking.core.network.datasource.coin

import com.songpol.coinranking.core.model.coin.CoinListParams
import com.songpol.coinranking.core.model.coin.InfoTimePeriod
import com.songpol.coinranking.core.model.coin.ListingOrderAttribute
import com.songpol.coinranking.core.model.coin.ListingOrderDirection
import com.songpol.coinranking.core.model.coin.USD_COIN_ID
import com.songpol.coinranking.core.network.model.coin.CoinListResponse
import com.songpol.coinranking.core.network.service.coin.FakeCoinService
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CoinNetworkDataSourceTest {

    private lateinit var subject: CoinNetworkDataSource

    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setUp() {
        subject = CoinNetworkDataSourceImpl(
            coinService = FakeCoinService(),
            ioDispatcher = testDispatcher,
        )
    }

    @Test
    fun testDeserializationOfStats() = runTest(testDispatcher) {
        assertEquals(
            CoinListResponse.Stats(
                total = 42423,
                totalCoins = 42423,
                totalMarkets = 40728,
                totalExchanges = 187,
                totalMarketCap = "2281264193389",
                total24hVolume = "64167273921"
            ),
            subject.getCoinList(
                params = CoinListParams(
                    limit = 25,
                    offset = 0,
                    orderBy = ListingOrderAttribute.MARKET_CAP,
                    orderDirection = ListingOrderDirection.DESC,
                    refCurrencyId = USD_COIN_ID,
                    timePeriod = InfoTimePeriod.ONE_DAY
                )
            ).stats,
        )
    }

    @Test
    fun testDeserializationOfCoins() = runTest(testDispatcher) {
        assertEquals(
            CoinListResponse.Coin(
                id = "Qwsogvtv82FCd",
                symbol = "BTC",
                name = "Bitcoin",
                hexColor = "#f7931A",
                iconUrl = "https://cdn.coinranking.com/bOabBYkcX/bitcoin_btc.svg",
                marketCap = "1245411953553",
                price = "63032.914595093804",
                listedAt = 1330214400,
                tier = 1,
                change = "-1.22",
                rank = 1,
                sparkline = listOf(
                    "63794.21624009277",
                    "64371.7936190545",
                    "64089.69566288794",
                    "63810.50994154504",
                    "63681.03431633117",
                    "63520.143039678704",
                    "63453.147401962764",
                    "63581.19456738095",
                    "63552.74854528229",
                    "63451.93076502735",
                    "63393.253370298415",
                    "63263.62802164388",
                    "63422.29132376571",
                    "63439.79249501532",
                    "63392.32557946569",
                    "63222.31159925527",
                    "63427.61477805898",
                    "63397.896606918235",
                    "63351.62153665101",
                    "63337.326615048034",
                    "63287.89174158725",
                    "63315.46214325402",
                    "63219.2305778546",
                    "62990.61807782698"
                ),
                lowVolume = false,
                coinrankingUrl = "https://coinranking.com/coin/Qwsogvtv82FCd+bitcoin-btc",
                dailyVolume = "25685377999",
                btcPrice = "1",
                contractAddresses = emptyList()
            ),
            subject.getCoinList(
                params = CoinListParams(
                    limit = 25,
                    offset = 0,
                    orderBy = ListingOrderAttribute.MARKET_CAP,
                    orderDirection = ListingOrderDirection.DESC,
                    refCurrencyId = USD_COIN_ID,
                    timePeriod = InfoTimePeriod.ONE_DAY
                )
            ).coins.first(),
        )
    }
}