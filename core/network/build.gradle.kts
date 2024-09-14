plugins {
    alias(libs.plugins.coinranking.android.library)
    alias(libs.plugins.coinranking.android.library.jacoco)
    alias(libs.plugins.coinranking.hilt)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.secrets)
}

android {
    namespace = "com.songpol.coinranking.core.network"
}

dependencies {
    implementation(libs.retrofit.core)
}

secrets {
    defaultPropertiesFileName = "secrets.defaults.properties"
}