package com.songpol.coinranking.core.network.util

import java.io.InputStream

internal fun interface AssetManager {
    fun open(fileName: String): InputStream
}