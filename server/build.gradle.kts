plugins {
    `common-conventions`
}

dependencies {
    implementation(libs.netty)
}

val genOutDir: Provider<Directory> = layout.buildDirectory.dir("generated/sources/packets/java/main")

val generatePacketIDs = registerGeneratorTask(
    "generatePacketIDs",
    "me.tud.mc2d.generators.PacketsGenerator",
    genOutDir
)

sourceSets.named("main") {
    java.srcDir(genOutDir)
}

tasks.withType<JavaCompile>().configureEach { 
    dependsOn(generatePacketIDs)
}
