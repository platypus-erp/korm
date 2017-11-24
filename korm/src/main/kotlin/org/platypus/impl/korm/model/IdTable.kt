package org.platypus.impl.korm.model

import org.platypus.impl.korm.identifiants.ModelID
import org.platypus.impl.korm.sql.Column
import org.platypus.impl.korm.sql.KormTable

abstract class IdTable(name: String) : KormTable(name) {
    abstract val id: Column<ModelID>

}
