plugins {
    alias(libs.plugins.coinranking.android.library)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.songpol.coinranking.core.model"
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
}