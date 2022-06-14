rootProject.name = "kotlin-collection-book-example"

pluginManagement {
    plugins {
        val kotlinVersion = "1.7.0"
        kotlin("jvm") version kotlinVersion
        kotlin("plugin.serialization") version kotlinVersion
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven ("https://maven.pkg.jetbrains.space/public/p/ktor/eap")
    }
}

include("mock-server")
