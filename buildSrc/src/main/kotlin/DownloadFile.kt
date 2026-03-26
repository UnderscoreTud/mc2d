import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import java.net.URI

abstract class DownloadFile : DefaultTask() {
    @get:Input
    abstract val sourceURL: Property<String>

    @get:OutputFile
    abstract val outputFile: RegularFileProperty

    @TaskAction
    fun download() {
        val out = outputFile.get().asFile
        out.parentFile.mkdirs()

        val url = sourceURL.map { URI(it).toURL() }.get()
        url.openStream().use { input -> out.outputStream().use { output -> input.copyTo(output) } }
    }
}