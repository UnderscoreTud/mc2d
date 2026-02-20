import org.gradle.accessors.dm.LibrariesForLibs

val libs = the<LibrariesForLibs>()

plugins {
    `java-library`
}

group = "me.tud.mc2d"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.machinemc.org/releases")
    }
}

dependencies {
    implementation(libs.apache.commons.lang3)
    implementation(libs.apache.commons.text)

    implementation(libs.gson)

    implementation(libs.guava)

    api(libs.joml)

    api(libs.jetbrains.annotations)

    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)

    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
    testCompileOnly(libs.lombok)
    testAnnotationProcessor(libs.lombok)

    implementation(libs.machinemc.scriptive.core)
    implementation(libs.machinemc.scriptive.gson)
    implementation(libs.machinemc.scriptive.nbt)

    implementation(libs.machinemc.nbt.core)
    implementation(libs.machinemc.nbt.parser)
}

tasks.withType<JavaCompile>().configureEach { 
    options.release.set(25)
}

tasks.test {
    useJUnitPlatform()
}
