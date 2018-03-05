package org.platypus.orm.sql.ddl

import org.platypus.orm.sql.ConstraintsVisitor
import org.platypus.orm.sql.ForeignKeyConstraint
import org.platypus.orm.sql.Index

abstract class DefaultDropConstraintVisitor<PARAM, RETURN>: ConstraintsVisitor<PARAM, RETURN> {
    override fun accept(fk: ForeignKeyConstraint, param: PARAM): RETURN {
        TODO("not implemented")
    }

    override fun accept(fk: Index, param: PARAM): RETURN {
        TODO("not implemented")
    }
}