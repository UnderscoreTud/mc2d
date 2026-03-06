plugins {
    `common-conventions`
}

dependencies {
    implementation(project(":common"))
    implementation(libs.jackson.core)
    implementation(libs.jackson.databind)
    implementation(libs.jackson.module.kotlin)

    implementation(libs.javapoet)
}

repositories {
    mavenCentral()
}

val minecraftVersion = "1.21.11"
val prismarineRef = "3.105.0"

val downloadedDir = layout.buildDirectory.dir("downloaded")
val archiveFile = downloadedDir.map { it.file("minecraft-data.zip").asFile }
val extractedDir = layout.buildDirectory.dir("extracted")
val generatedResourcesDir = layout.buildDirectory.dir("generated-resources/main")

sourceSets {
    main {
        resources.srcDir(generatedResourcesDir)
    }
}

val downloadTask = tasks.register<DownloadFile>("downloadMinecraftData") {
    group = "minecraft data"
    description = "Downloads the minecraft-data repository archive"

    sourceURL = "https://github.com/PrismarineJS/minecraft-data/archive/${prismarineRef}.zip"
    outputFile = archiveFile

    doFirst { println("Downloading minecraft-data from ${sourceURL.get()}") }
    doLast { println("Downloaded minecraft-data successfully") }
    
    inputs.properties(
        Pair("minecraftVersion", minecraftVersion),
        Pair("prismarineRef", prismarineRef),
    )
}

val extractTask = tasks.register<Copy>("extractMinecraftData") {
    group = "minecraft data"
    description = "Extracts the downloaded minecraft-data archive"

    dependsOn(downloadTask)

    from(zipTree(archiveFile))

    into(extractedDir)
}

val prepareTask = tasks.register<PrepareMinecraftData>("prepareMinecraftData") {
    group = "minecraft data"
    description = "Copies the selected minecraft-data JSON files into generates resources"

    dependsOn(extractTask)

    inputDir = extractedDir
    mcVersion = minecraftVersion
    registries = listOf(
        "blocks",
        "items",
        "entities"
    )
    destDir = generatedResourcesDir.map { it.dir("minecraft-data") }
}

tasks.named("processResources") {
    dependsOn(prepareTask)
}
