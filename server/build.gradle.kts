import org.machinemc.paklet.plugin.PakletPlugin

plugins {
    `common-conventions`
    application
}

buildscript {
    repositories {
        maven {
            url = uri("https://repo.machinemc.org/releases")
        }
        dependencies {
            classpath(libs.machinemc.paklet.plugin)
        }
    }
}

apply<PakletPlugin>()

application {
    mainClass.set("me.tud.mc2d.Main")
}

dependencies {
    implementation(project(":common"))

    implementation(libs.fastutil)

    implementation(libs.machinemc.paklet.api)
    implementation(libs.machinemc.paklet.core)
    annotationProcessor(libs.machinemc.paklet.processor)

    implementation(libs.netty)
}

val genOutDir: Provider<Directory> = layout.buildDirectory.dir("generated/sources/java/main")

val generatePacketIDs = registerGeneratorTask(
    "generatePacketIDs",
    "me.tud.mc2d.generators.PacketsGenerator",
    genOutDir
)

val generateDimensionTypes = registerGeneratorTask(
    "generateDimensionTypes",
    "me.tud.mc2d.generators.DimensionTypesGenerator",
    genOutDir
)

val generateDamageTypes = registerGeneratorTask(
    "generateDamageTypes",
    "me.tud.mc2d.generators.DamageTypesGenerator",
    genOutDir
)

sourceSets.named("main") {
    java.srcDir(genOutDir)
}

tasks.withType<JavaCompile>().configureEach { 
    dependsOn(generatePacketIDs)
    dependsOn(generateDimensionTypes)
    dependsOn(generateDamageTypes)
}
