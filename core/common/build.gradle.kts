plugins{
    alias(libs.plugins.coinranking.android.library)
}

android {
    namespace = "com.songpol.coinranking.core.common"
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
}