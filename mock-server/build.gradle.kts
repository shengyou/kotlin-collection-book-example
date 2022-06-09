plugins {
    application
    kotlin("jvm")
    kotlin("plugin.serialization")
}

group = "io.kraftsman"
version = "0.0.1"
application {
    mainClass.set("io.kraftsman.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:2.0.2")
    implementation("io.ktor:ktor-server-content-negotiation-jvm:2.0.2")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:2.0.2")
    implementation("io.ktor:ktor-server-netty-jvm:2.0.2")
    implementation("io.github.serpro69:kotlin-faker:1.11.0")
    implementation("ch.qos.logback:logback-classic:1.2.11")
    testImplementation("io.ktor:ktor-server-tests-jvm:2.0.2")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.20")
}
