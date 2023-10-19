plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {

    // Coroutines
    implementation(libs.coroutines.android)

    // Paging
    implementation(libs.paging.common)

    // Koin
    implementation(libs.koin.core)

}