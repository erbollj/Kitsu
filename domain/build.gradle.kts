plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(Dependencies.Kotlin.coroutines)
    implementation(Dependencies.Paging.common)
    implementation(Dependencies.Koin.core)
}