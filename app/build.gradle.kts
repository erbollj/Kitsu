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
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures.viewBinding = true

}

dependencies {

    implementation(project(":domain"))
    implementation(project(":data"))
    implementation(Dependencies.Core.core)
    implementation(Dependencies.UIComponents.appCompat)
    implementation(Dependencies.UIComponents.material)
    implementation(Dependencies.UIComponents.constraintLayout)

    testImplementation(Dependencies.JUnit.jUnit)
    androidTestImplementation(Dependencies.JUnit.testJUnit)
    androidTestImplementation(Dependencies.Espesso.espresso)
}