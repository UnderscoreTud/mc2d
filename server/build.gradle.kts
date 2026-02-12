plugins {
    `common-conventions`
    application
}

application {
    mainClass.set("me.tud.mc2d.Main")
}

dependencies {
    implementation(project(":common"))
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

sourceSets.named("main") {
    java.srcDir(genOutDir)
}

tasks.withType<JavaCompile>().configureEach { 
    dependsOn(generatePacketIDs)
    dependsOn(generateDimensionTypes)
}
