plugins {
    alias(libs.plugins.coinranking.android.library)
    alias(libs.plugins.coinranking.android.library.jacoco)
    alias(libs.plugins.coinranking.android.room)
    alias(libs.plugins.coinranking.hilt)
}

android {
    namespace = "com.songpol.coinranking.core.database"
}

dependencies {
    api(projects.core.model)

    implementation(libs.kotlinx.serialization.json)

    androidTestImplementation(libs.androidx.test.core)
    androidTestImplementation(libs.androidx.test.runner)
    androidTestImplementation(libs.kotlinx.coroutines.test)
}