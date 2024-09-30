package com.songpol.coinranking.core.database.util

import androidx.room.TypeConverter
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class ListOfStringTypeConverter {
    @TypeConverter
    fun fromListOfString(value: List<String>) = Json.encodeToString(value)

    @TypeConverter
    fun toListOfString(value: String) = Json.decodeFromString<List<String>>(value)
}