package com.songpol.coinranking.core.model.coin

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// 1h, 3h, 12h, 24h, 7d, 30d, 3m, 1y, 3y, 5y
@Serializable
enum class InfoTimePeriod {
    @SerialName("1h")
    ONE_HOUR,
    @SerialName("3h")
    THREE_HOURS,
    @SerialName("12h")
    TWELVE_HOURS,
    @SerialName("24h")
    ONE_DAY,
    @SerialName("7d")
    SEVEN_DAYS,
    @SerialName("30d")
    ONE_MONTH,
    @SerialName("3m")
    THREE_MONTHS,
    @SerialName("1y")
    ONE_YEAR,
    @SerialName("3y")
    THREE_YEARS,
    @SerialName("5y")
    FIVE_YEARS,
}