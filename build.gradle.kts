plugins {
    kotlin("jvm") version "2.4.20"
    application
}

group = "id.ac.praktikum.oop"
version = "1.0.0"

application {
    mainClass.set("MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(26)
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaExec> {
    jvmArgs("-Dfile.encoding=UTF-8")
}

// Agar input keyboard terbaca saat menjalankan ./gradlew run
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}