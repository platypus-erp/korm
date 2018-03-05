package org.platypus.orm.database.vendors

import org.platypus.model.ModelVisitor
import org.platypus.model.field.api.FieldVisitor
import org.platypus.orm.database.ddl.FieldDDL
import org.platypus.orm.database.ddl.TableDDL
import org.platypus.orm.sql.ConstraintsVisitor

interface ForeignKeyConstraint

enum class DDL_MODE {
    CREATE, DROP, ALTER
}

interface DialectDDL {
    val dataTypeProvider: FieldVisitor<DDL_MODE, FieldDDL>
    val modelTypeProvider: ModelVisitor<DDL_MODE, TableDDL>
    val constraintVisitor: ConstraintsVisitor<Unit, String>
}
