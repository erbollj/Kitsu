plugins {
    id("com.android.application")
    kotlin("kapt")
    kotlin("android")
}

android {
    namespace = "com.example.kitsuapi"
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        applicationId = "com.example.kitsuapi"
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk
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
    implementation(Dependencies.Core.core)
    implementation(Dependencies.Koin.koinAndroid)
    implementation(Dependencies.UIComponents.appCompat)
    implementation(Dependencies.UIComponents.material)
    implementation(Dependencies.UIComponents.constraintLayout)
    implementation(Dependencies.Navigation.fragment)
    implementation(Dependencies.Fragment.fragment)
    implementation(Dependencies.Lifecycle.viewModel)
    implementation(Dependencies.Lifecycle.runtime)
    implementation(Dependencies.Lifecycle.liveData)
    implementation(Dependencies.Navigation.ui)
    implementation(Dependencies.Paging.runtime)
    implementation(Dependencies.Glide.glide)
    testImplementation(Dependencies.JUnit.jUnit)
    androidTestImplementation(Dependencies.JUnit.testJUnit)
    androidTestImplementation(Dependencies.Espesso.espresso)
}