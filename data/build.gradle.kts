plugins {
    id(libs.plugins.agp.library.get().pluginId)
    id(libs.plugins.jgp.android.get().pluginId)
}

android {
    namespace = "com.example.data"
    compileSdk = config.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = config.versions.minSdk.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
}

dependencies {

    implementation(project(":domain"))

    // Paging
    implementation(libs.paging.runtime)

    // Koin
    implementation(libs.koin.android)

    // Retrofit
    implementation(libs.bundles.retrofitBundle)

    //OkHttpInterceptor
    implementation(libs.loggingInterceptor.interceptor)

}