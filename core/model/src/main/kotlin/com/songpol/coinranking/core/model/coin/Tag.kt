package com.songpol.coinranking.core.model.coin

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// defi, stablecoin, nft, dex, exchange, staking, dao, meme, privacy, metaverse, gaming, wrapped,
// layer-1, layer-2, fan-token, football-club, web3, social
@Serializable
enum class CoinTag {
    @SerialName("defi")
    DEFI,
    @SerialName("stablecoin")
    STABLECOIN,
    @SerialName("nft")
    NFT,
    @SerialName("dex")
    DEX,
    @SerialName("exchange")
    EXCHANGE,
    @SerialName("staking")
    STAKING,
    @SerialName("dao")
    DAO,
    @SerialName("meme")
    MEME,
    @SerialName("privacy")
    PRIVACY,
    @SerialName("metaverse")
    METAVERSE,
    @SerialName("gaming")
    GAMING,
    @SerialName("wrapped")
    WRAPPED,
    @SerialName("layer-1")
    LAYER_1,
    @SerialName("layer-2")
    LAYER_2,
    @SerialName("fan-token")
    FAN_TOKEN,
    @SerialName("football-club")
    FOOTBALL_CLUB,
    @SerialName("web3")
    WEB3,
    @SerialName("social")
    SOCIAL,
}