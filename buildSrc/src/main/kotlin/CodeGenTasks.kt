import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.tasks.JavaExec
import org.gradle.api.tasks.PathSensitivity
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.the
import sun.jvmstat.monitor.MonitoredVmUtil.mainClass

/**
 * Registers a generator task
 * 
 * @param name The name of the task.
 * @param generatorMainClass The generator's main class.
 * @param outputDir The output directory.
 */
fun Project.registerGeneratorTask(
    name: String,
    generatorMainClass: String,
    outputDir: Any
) = tasks.register<JavaExec>(name) {
    group = "code generation"
    description = "Runs $generatorMainClass to generate sources."

    val outputDirFile = project.file(outputDir)

    val genProject = project(":code-generators")
    classpath = genProject.the<JavaPluginExtension>().sourceSets.getByName("main").runtimeClasspath

    mainClass.set(generatorMainClass)
    val args = listOf("--output", outputDirFile.absolutePath)
    args(args)

    inputs.files(classpath)
        .withPropertyName("generatorClasspath")
        .withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.property("generatorMainClass", generatorMainClass)
    inputs.property("generatorArgs", args)
    inputs.dir(genProject.layout.projectDirectory.dir("src/main/resources"))
        .withPathSensitivity(PathSensitivity.RELATIVE)
    outputs.dir(outputDirFile)
}
