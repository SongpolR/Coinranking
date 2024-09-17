package com.songpol.coinranking.core.model.coin

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// defi, stablecoin, nft, dex, exchange, staking, dao, meme, privacy, metaverse, gaming, wrapped,
// layer-1, layer-2, fan-token, football-club, web3, social
@Serializable
enum class CoinTag {
    @SerialName("defi")
    DEFI
}