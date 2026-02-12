plugins {
    `common-conventions`
}

dependencies {
    implementation(project(":common"))
    implementation(libs.javapoet)
}

repositories {
    mavenCentral()
}
