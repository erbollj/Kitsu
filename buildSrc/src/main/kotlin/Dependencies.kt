object Dependencies {

    object Kotlin {

        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0"
        const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.20"

        object KSP {
            const val ksp = "com.google.devtools.ksp"
            const val version = "1.6.10-1.0.4"
        }
    }

    object UIComponents {
        const val material = "com.google.android.material:material:1.5.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"
        const val viewBindingPropertyDelegate =
            "com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.6"
        const val appCompat = "androidx.appcompat:appcompat:1.6.1"
    }

    object JUnit {
        const val jUnit = "junit:junit:4.13.2"
        const val testJUnit = "androidx.test.ext:junit:1.1.5"
    }

    object Core {
        private const val version = "1.8.0"

        const val core = "androidx.core:core-ktx:$version"
    }

    object Espesso {
        const val espresso = "androidx.test.espresso:espresso-core:3.5.1"
    }

    object Activity {
        private const val version = "1.4.0"

        const val activity = "androidx.activity:activity-ktx:$version"
    }

    object Fragment {
        private const val version = "1.4.1"

        const val fragment = "androidx.fragment:fragment-ktx:$version"
    }

    object Lifecycle {
        private const val version = "2.4.1"

        // | for Lifecycles only (without ViewModel or LiveData)
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$version"

        // | for ViewModel
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
    }

    object Navigation {
        private const val version = "2.4.1"

        const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
        const val ui = "androidx.navigation:navigation-ui-ktx:$version"
        const val safeArgsPlugin = "androidx.navigation.safeargs.kotlin"
        const val safeArgsGradlePlugin =
            "androidx.navigation:navigation-safe-args-gradle-plugin:$version"
    }

    object Hilt {
        private const val version = "2.41"

        const val android = "com.google.dagger:hilt-android:$version"
        const val compiler = "com.google.dagger:hilt-compiler:$version"
        const val plugin = "com.google.dagger.hilt.android"
        const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
    }

    object Retrofit {
        private const val version = "2.9.0"

        const val retrofit = "com.squareup.retrofit2:retrofit:$version"
        const val converterGson = "com.squareup.retrofit2:converter-gson:$version"
    }

    object OkHttp {
        private const val version = "5.0.0-alpha.5"

        const val bom = "com.squareup.okhttp3:okhttp-bom:$version"
        const val okHttp = "com.squareup.okhttp3:okhttp"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor"
    }

    object Paging {
        private const val version = "3.1.1"

        const val runtime = "androidx.paging:paging-runtime-ktx:$version"
    }

    object SplashScreen {
        const val splashScreen = "androidx.core:core-splashscreen:1.0.0-beta01"
    }

    object Glide {
        const val glide = "com.github.bumptech.glide:glide:4.13.0"
    }

    object Koin {
        private const val version = "3.2.0-beta-1"
        const val koinAndroid = "io.insert-koin:koin-android:$version"

    }

    object Gradle {
        const val gradlePlugin = "com.android.tools.build:gradle:7.1.2"
    }
}