package org.platypus.data.importer

import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import org.platypus.PlatypusEnvironment
import org.platypus.repository.RecordRepository
import java.io.InputStream
import java.nio.charset.Charset

object CSVImporter : PlatypusDataImporter{
    override val allowedExtention: Set<String> = setOf("csv")

    override fun readFile(env: PlatypusEnvironment, stream: InputStream, repo: RecordRepository<*>): List<String> {
        val format = CSVFormat.DEFAULT.withEscape('"').withFirstRecordAsHeader()
        val parser = CSVParser.parse(stream, Charset.defaultCharset(), format)
        val header = parser.headerMap
        for (line in parser){
            val rec = repo.new {  }
            for (name in header.keys){
                rec[name] = line.get(name)
            }
        }
        return emptyList()
    }
}