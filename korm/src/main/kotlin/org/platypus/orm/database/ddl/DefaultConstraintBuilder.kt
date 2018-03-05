package org.platypus.orm.database.ddl

import org.platypus.orm.sql.ConstraintsVisitor
import org.platypus.orm.sql.ForeignKeyConstraint
import org.platypus.orm.sql.Index

abstract class DefaultConstraintBuilder : ConstraintsVisitor<Unit, String> {

    override fun accept(fk: ForeignKeyConstraint, param: Unit): String {
        TODO("not implemented")
    }

    override fun accept(fk: Index, param: Unit): String {
        TODO("not implemented")
    }
}