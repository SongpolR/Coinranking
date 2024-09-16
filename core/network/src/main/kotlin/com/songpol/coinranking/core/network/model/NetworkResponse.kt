package com.songpol.coinranking.core.network.model

import kotlinx.serialization.Serializable

/**
 * Wrapper for data provided from the API
 */
@Serializable
private data class NetworkResponse<T>(
    val data: T,
)