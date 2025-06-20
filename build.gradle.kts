plugins {
    kotlin("jvm") version "1.9.23" // or latest
    application
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "21"
    }
}

//kotlin {
//    jvmToolchain {
//        languageVersion.set(JavaLanguageVersion.of(21))
//    }
//}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test")) // for kotlin.test
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0") // for JUnit 5
}

tasks.test {
    useJUnitPlatform() // ← CRUCIAL for JUnit 5 support
}

application {
    mainClass.set("your.package.MainKt") // replace with your main class
}