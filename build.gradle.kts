plugins {
    kotlin("jvm") version "2.2.20"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.github.oshai:kotlin-logging-jvm:7.0.13")
    runtimeOnly("org.slf4j:slf4j-simple:2.0.17")
}

kotlin {
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of("21")
        vendor = JvmVendorSpec.AMAZON
    }
}

application {
    mainClass.set("com.example.demo.AppKt")
}