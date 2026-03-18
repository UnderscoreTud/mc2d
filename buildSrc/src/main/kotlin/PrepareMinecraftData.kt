import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

abstract class PrepareMinecraftData : DefaultTask() {
    @get:InputDirectory
    abstract val inputDir: DirectoryProperty

    @get:Input
    abstract val mcVersion: Property<String>

    @get:Input
    abstract val includedRegistries: ListProperty<String>

    @get:OutputDirectory
    abstract val destDir: DirectoryProperty

    @TaskAction
    fun run() {
        val dest = destDir.get().asFile
        dest.deleteRecursively()

        val included = includedRegistries.get()

        val root = inputDir.get().asFile
        val extractedRoot = root.listFiles()?.singleOrNull()
            ?: error("Expected exactly one root directory inside extracted archive")

        val dataRoot = extractedRoot.resolve("data")
        val dataPaths = dataRoot.resolve("dataPaths.json")

        val mapper = jacksonObjectMapper()
        val registries = mapper.readTree(dataPaths).path("pc").path(mcVersion.get())

        registries.properties()
            .filter { included.contains(it.key) }
            .forEach { (registry, directory) ->
                val source = dataRoot.resolve("${directory.asText()}/$registry.json")
                source.copyTo(dest.resolve("$registry.json"))
            }
    }
}