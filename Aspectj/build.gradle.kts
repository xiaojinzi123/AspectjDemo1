plugins {
    kotlin("jvm") version "1.9.21"
}

group = "com.xiaojinzi"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    runtimeOnly("org.aspectj:aspectjrt:1.9.21")
    implementation("org.aspectj:aspectjtools:1.9.21")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}