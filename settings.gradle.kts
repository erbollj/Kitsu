pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("config") {
            from(files("gradle/config.versions.toml"))
        }
    }
}
rootProject.name = "Kitsu Api"
include(":app")
include(":domain")
include(":data")
