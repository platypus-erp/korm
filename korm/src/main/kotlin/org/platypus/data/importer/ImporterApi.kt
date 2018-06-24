package org.platypus.data.importer

import org.platypus.PlatypusEnvironment
import org.platypus.repository.RecordRepository
import java.io.InputStream

interface PlatypusDataImporter{

    /**
     * The extentions of the file that this importer can read
     */
    val allowedExtention : Set<String>

    /**
     * Read the file and do what ever you want with it
     * @return all the errors detected in the file
     */
    fun readFile(env: PlatypusEnvironment, stream: InputStream, repo: RecordRepository<*>):List<String>
}