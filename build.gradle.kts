// Top-level build file where you can add configuration options common to all sub-projects/modules.

val config = the<org.gradle.accessors.dm.LibrariesForConfig>()

plugins {
    alias(libs.plugins.agp.application) apply false
    alias(libs.plugins.agp.library) apply false
    alias(libs.plugins.jgp.android) apply false
    alias(libs.plugins.jgp.jvm) apply false
    alias(libs.plugins.jetBrains.dokka)
}

buildscript {
    dependencies {
        classpath(libs.jetBrains.dokka.gradle)
        classpath(libs.jetBrains.dokka.android.documentation)
        classpath(libs.jetBrains.dokka.android.gradle)
    }
}

allprojects {

    apply(plugin = rootProject.project.libs.plugins.jetBrains.dokka.get().pluginId)

    tasks.withType<org.jetbrains.dokka.gradle.DokkaTaskPartial>().configureEach {
        suppressInheritedMembers.set(true)
        dokkaSourceSets.configureEach {
            documentedVisibilities.set(
                org.jetbrains.dokka.DokkaConfiguration.Visibility.values().toSet()
            )
        }

        pluginConfiguration<org.jetbrains.dokka.base.DokkaBase, org.jetbrains.dokka.base.DokkaBaseConfiguration> {
            footerMessage =
                config.versions.documentationCommonFooterMessage.get() + "© ${java.time.Year.now().value} Copyright."
        }
    }

}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

tasks.dokkaHtmlMultiModule {
    moduleName.set("")
    moduleVersion.set(config.versions.versionName.get())

    pluginConfiguration<org.jetbrains.dokka.base.DokkaBase, org.jetbrains.dokka.base.DokkaBaseConfiguration> {
        customAssets = listOf(file("$projectDir/geek_studio.svg"))
        footerMessage =
            config.versions.documentationCommonFooterMessage.get() + "© ${java.time.Year.now().value} Copyright."
        customStyleSheets =
            listOf(file("$projectDir/logo-style.css"), file("$projectDir/logo-styles.css"))
    }
}

