plugins {
    `common-conventions`
    idea
}

dependencies {
    api(project(":common"))
    api(project(":api"))

    implementation(libs.fastutil)
}

val genOutDir: Directory = layout.projectDirectory.dir("src/generated/java")

val generationTasks = arrayOf(
    registerGeneratorTask(
        "generateBlocks",
        "me.tud.mc2d.generators.blocks.BlocksGenerator",
        genOutDir
    ),
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
