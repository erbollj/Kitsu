plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.data"
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        minSdk = AndroidConfig.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    testImplementation(Dependencies.JUnit.jUnit)
    androidTestImplementation(Dependencies.JUnit.testJUnit)
    implementation(Dependencies.Retrofit.retrofit)
//    implementation(Dependencies.OkHttp.okHttp)
//    implementation(Dependencies.OkHttp.bom)
    implementation(Dependencies.OkHttp.loggingInterceptor)
    implementation(Dependencies.Paging.runtime)
    implementation(Dependencies.Koin.koinAndroid)
    implementation(Dependencies.Retrofit.converterGson)
    implementation(project(":domain"))

}