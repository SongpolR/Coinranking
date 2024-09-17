package com.songpol.coinranking.core.model.coin

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// cmc (CoinMarketCap), website, bitcointalk, github, reddit, telegram, whitepaper
@Serializable
enum class CoinLinkType {
    @SerialName("cmc")
    COIN_MARKET_CAP,
    @SerialName("website")
    WEBSITE,
    @SerialName("bitcointalk")
    BITCOIN_TALK,
    @SerialName("github")
    GITHUB,
    @SerialName("reddit")
    REDDIT,
    @SerialName("telegram")
    TELEGRAM,
    @SerialName("whitepaper")
    WHITE_PAPER,
}