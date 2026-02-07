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
    compileOnly("org.projectlombok:lombok:1.18.38")
    annotationProcessor("org.projectlombok:lombok:1.18.38")
    implementation("io.netty:netty-all:4.2.10.Final")
    implementation("com.google.guava:guava:33.4.8-jre")
    implementation("com.google.code.gson:gson:2.13.0")
    implementation("org.joml:joml:1.10.8")
    implementation("org.machinemc:scriptive-core:1.3")
    implementation("org.machinemc:scriptive-gson:1.3")
    implementation("org.machinemc:scriptive-nbt:1.3")
    implementation("org.machinemc:nbt-core:2.0.0")
    implementation("org.machinemc:nbt-parser:2.0.0")

    testCompileOnly("org.projectlombok:lombok:1.18.38")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.38")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}