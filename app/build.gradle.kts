plugins {
    id(libs.plugins.agp.application.get().pluginId)
    kotlin("kapt")
    kotlin("android")
}

android {
    namespace = "com.example.kitsuapi"
    compileSdk = config.versions.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "com.example.kitsuapi"
        minSdk = config.versions.minSdk.get().toInt()
        targetSdk = config.versions.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures.viewBinding = true

}

dependencies {

    implementation(project(":domain"))
    implementation(project(":data"))

    // UI Components
    implementation(libs.bundles.uiComponents)

    // Core
    implementation(libs.android.core)

    // Fragment
    implementation(libs.fragment.fragment)

    // Lifecycle
    implementation(libs.bundles.lifecycleBundle)

    // Navigation
    implementation(libs.bundles.navigationBundle)

    // Glide
    implementation(libs.glide.glide)

    // Paging
    implementation(libs.paging.runtime)

    // Koin
    implementation(libs.koin.android)

    // Lottie
    implementation(libs.lottie.lottie)

}