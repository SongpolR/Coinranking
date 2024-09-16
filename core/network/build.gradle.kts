plugins {
    alias(libs.plugins.coinranking.android.library)
    alias(libs.plugins.coinranking.android.library.jacoco)
    alias(libs.plugins.coinranking.hilt)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.secrets)
}

android {
    namespace = "com.songpol.coinranking.core.network"

    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation(libs.okhttp.logging)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.retrofit.core)
}

secrets {
    defaultPropertiesFileName = "secrets.defaults.properties"
}