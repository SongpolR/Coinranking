package com.songpol.coinranking.core.network.model.coin

import com.songpol.coinranking.core.model.coin.CoinId
import com.songpol.coinranking.core.model.coin.CoinSymbol
import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * "data": {
 *         "stats": {
 *             "total": 42199,
 *             "totalCoins": 42199,
 *             "totalMarkets": 39897,
 *             "totalExchanges": 186,
 *             "totalMarketCap": "2117336333454",
 *             "total24hVolume": "51502217999"
 *         },
 *         "coins": [
 *             {
 *                 "uuid": "Qwsogvtv82FCd",
 *                 "symbol": "BTC",
 *                 "name": "Bitcoin",
 *                 "color": "#f7931A",
 *                 "iconUrl": "https://cdn.coinranking.com/bOabBYkcX/bitcoin_btc.svg",
 *                 "marketCap": "1169717358003",
 *                 "price": "59210.39291248964",
 *                 "listedAt": 1330214400,
 *                 "tier": 1,
 *                 "change": "1.05",
 *                 "rank": 1,
 *                 "sparkline": [
 *                     "58648.17227031696",
 *                     "58414.38479158009",
 *                     "58026.31573291718",
 *                     "57849.19367240547",
 *                     "57835.917785500445",
 *                     "57760.27228242456",
 *                     "57883.7884497214",
 *                     "57934.19222784069",
 *                     "57909.46745671943",
 *                     "57836.291523158325",
 *                     "57944.27677528646",
 *                     "58197.238886393745",
 *                     "58159.73062438481",
 *                     "57828.7173718049",
 *                     "57988.337951848",
 *                     "58095.14143202824",
 *                     "58195.06548649135",
 *                     "58383.58967559749",
 *                     "58538.98401246809",
 *                     "58598.669354246806",
 *                     "58752.01744777951",
 *                     "58824.26355803772",
 *                     "59105.10513069902",
 *                     "59151.690136651065"
 *                 ],
 *                 "lowVolume": false,
 *                 "coinrankingUrl": "https://coinranking.com/coin/Qwsogvtv82FCd+bitcoin-btc",
 *                 "24hVolume": "23999780257",
 *                 "btcPrice": "1",
 *                 "contractAddresses": []
 *             },
 */

@Serializable
data class CoinsResponse(
    @SerialName("stats") val stat: Stats,
    @SerialName("coins") val coins: List<Coin>,
){

    @Serializable
    data class Stats (
        @SerialName("total") val total: Int,
        @SerialName("totalCoins") val totalCoins: Int,
        @SerialName("totalMarkets") val totalMarkets: Int,
        @SerialName("totalExchanges") val totalExchanges: Int,
        @SerialName("totalMarketCap") val totalMarketCap: String,
        @SerialName("total24hVolume") val total24hVolume: String
    )

    @Serializable
    data class Coin (
        @SerialName("uuid") val id: CoinId,
        @SerialName("symbol") val symbol: CoinSymbol,
        @SerialName("name") val name: String,
        @SerialName("color") val hexColor: String,
        @SerialName("iconUrl") val iconUrl: String,
        @SerialName("marketCap") val marketCap: String,
        @SerialName("price") val price: String,
        @SerialName("listedAt") val listedAt: Instant,
        @SerialName("tier") val tier: Int,
        @SerialName("change") val change: String,
        @SerialName("rank") val rank: Int,
        @SerialName("sparkline") val sparkline: List<String>,
        @SerialName("lowVolume") val lowVolume: Boolean,
        @SerialName("coinrankingUrl") val coinrankingUrl: String,
        @SerialName("24hVolume") val dailyVolume: String,
        @SerialName("btcPrice") val btcPrice: String,
        @SerialName("contractAddresses") val contractAddresses: List<String>,
    )
}

