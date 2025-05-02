plugins {
    id("java")
}

group = "me.tud"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.machinemc.org/releases")
    }
}

dependencies {
    compileOnly("org.jetbrains:annotations:26.0.2")
    implementation("io.netty:netty-all:4.2.0.Final")
    implementation("com.google.guava:guava:33.4.8-jre")
    implementation("com.google.code.gson:gson:2.13.0")
    implementation("org.machinemc:scriptive-core:1.3")
    implementation("org.machinemc:scriptive-gson:1.3")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}