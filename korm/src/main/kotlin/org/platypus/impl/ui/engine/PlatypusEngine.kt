package org.platypus.impl.ui.engine

import com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER
import freemarker.template.Configuration
import freemarker.template.TemplateExceptionHandler
import org.platypus.api.config.PlatypusConf
import org.platypus.api.config.PlatypusUIConf.Companion.pathViews
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.ui.ViewApi
import org.platypus.impl.ui.template.PlatypusTemplateLoader
import java.io.File
import java.io.FileOutputStream
import java.io.FileWriter
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.FileVisitResult
import java.io.IOException
import java.nio.file.attribute.BasicFileAttributes
import java.nio.file.SimpleFileVisitor


class PlatypusEngine(confUI: PlatypusConf) {
    private val tmpPath = Paths.get(confUI.pathPlatypus)
    val pathViews = tmpPath.resolve(confUI.pathViews)
    private val pathTemplate = tmpPath.resolve("template")
    private val cfg = Configuration(Configuration.VERSION_2_3_23)

    init {
        sanitizeFile()
        configureFreeMarker()
    }

    private fun sanitizeFile() {
        if (!tmpPath.toFile().exists()) {
            Files.createDirectories(tmpPath)
        }
        deletePath(pathViews)
        Files.createDirectory(pathViews)

        deletePath(pathTemplate)
        Files.createDirectory(pathTemplate)

        LOGGER.info("The generated view path is ${pathViews.toAbsolutePath()}")
    }

    private fun deletePath(path: Path) {
        if (Files.exists(path)) {
            Files.walkFileTree(path, object : SimpleFileVisitor<Path>() {
                @Throws(IOException::class)
                override fun visitFile(file: Path, attrs: BasicFileAttributes): FileVisitResult {
                    Files.delete(file)
                    return FileVisitResult.CONTINUE
                }

                @Throws(IOException::class)
                override fun postVisitDirectory(dir: Path, exc: IOException?): FileVisitResult {
                    Files.delete(dir)
                    return FileVisitResult.CONTINUE
                }

            })
        }
    }

    private fun copyTemplate() {
        val stream = PlatypusTemplateLoader::class.java.getResourceAsStream("tree.ftlh")
        copyStreamToFile(stream, Files.createFile(pathTemplate.resolve("tree.ftlh")).toFile())
    }

    private fun copyStreamToFile(inStream: InputStream, outFile: File) {
        val buffer = ByteArray(inStream.available())
        inStream.read(buffer)
        FileOutputStream(outFile).write(buffer)
    }

    private fun configureFreeMarker() {
        cfg.defaultEncoding = "UTF-8"
        cfg.templateExceptionHandler = TemplateExceptionHandler.RETHROW_HANDLER
        cfg.logTemplateExceptions = false
        cfg.setDirectoryForTemplateLoading(pathTemplate.toFile())
    }

    fun init() {
        sanitizeFile()
        copyTemplate()
    }

    fun generateViewsForModel(model: BaseModel<*, *>, views: Set<ViewApi>) {
        LOGGER.info("Starting generating Views")
        val pathViewModel = pathViews.resolve(model.modelName)
        Files.createDirectory(pathViewModel)
        for (view in views) {
            val root = HashMap<String, Any>()
            root["view"] = view
            val temp = cfg.getTemplate(view.getTemplateName())
            val fileName = view.name + ".html"
            val out = FileWriter(Files.createFile(pathViewModel.resolve(fileName)).toFile())
            temp.process(root, out)
        }
    }
}