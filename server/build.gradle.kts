import org.machinemc.paklet.plugin.PakletPlugin

plugins {
    `common-conventions`
    application
    idea
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

val genOutDir: Directory = layout.projectDirectory.dir("src/generated/java")

val generationTasks = arrayOf(
    registerGeneratorTask(
        "generatePacketIDs",
        "me.tud.mc2d.generators.packets.PacketsGenerator",
        genOutDir
    ),
    registerGeneratorTask(
        "generateDimensionTypes",
        "me.tud.mc2d.generators.dimensiontypes.DimensionTypesGenerator",
        genOutDir
    ),
    registerGeneratorTask(
        "generateDamageTypes",
        "me.tud.mc2d.generators.damagetypes.DamageTypesGenerator",
        genOutDir
    ),
    registerGeneratorTask(
        "generatePaintingVariants",
        "me.tud.mc2d.generators.paintingvariants.PaintingVariantsGenerator",
        genOutDir
    ),
    registerGeneratorTask(
        "generateBlocks",
        "me.tud.mc2d.generators.blocks.BlocksGenerator",
        genOutDir
    ),
    registerGeneratorTask(
        "generateItemss",
        "me.tud.mc2d.generators.items.ItemsGenerator",
        genOutDir
    )
)

tasks.register("generateAll") {
    group = "code generation"
    description = "Run all the code generation tasks"

    dependsOn(generationTasks)
}

sourceSets.named("main") {
    java.srcDir(genOutDir)
}

idea {
    module {
        generatedSourceDirs.add(genOutDir.asFile)
    }
}

tasks.withType<JavaCompile>().configureEach { 
    dependsOn(generationTasks)
}
