plugins {
    alias(libs.plugins.coinranking.android.library)
    alias(libs.plugins.coinranking.hilt)
}

android {
    namespace = "com.songpol.coinranking.core.data"
}

dependencies {
    api(projects.core.network)

    implementation(libs.androidx.paging.runtime)
}