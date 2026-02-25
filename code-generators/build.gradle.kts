plugins {
    `common-conventions`
}

dependencies {
    implementation(project(":common"))
    implementation(libs.jackson.core)
    implementation(libs.jackson.databind)

    implementation(libs.javapoet)
}

repositories {
    mavenCentral()
}
