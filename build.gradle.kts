import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.50"
    id("com.github.johnrengelman.shadow") version "5.0.0"
}

group = "com.10pines"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        setUrl("https://dl.bintray.com/konform-kt/konform")
    }
}

dependencies {

    implementation(kotlin("stdlib-jdk8"))

    testImplementation("junit", "junit", "4.12")
    testImplementation("com.willowtreeapps.assertk", "assertk", "0.10")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
