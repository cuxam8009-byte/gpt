plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "app.phlom.ai"
    compileSdk = 35
    defaultConfig {
        applicationId = "app.phlom.ai"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }
}
