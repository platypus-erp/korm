package org.platypus.orm.database.vendors

import org.platypus.model.Alias
import org.platypus.model.LinkModel
import org.platypus.model.MixinModel
import org.platypus.model.Model
import org.platypus.model.ModelVisitor

interface ModelNameVisitor : ModelVisitor<String, String> {
    override fun visit(m: Model<*>, p: String): String = m.tableName.inProperCase().quotedIfNeeded()

    override fun visit(m: LinkModel<*, *>, p: String): String = m.tableName.inProperCase().quotedIfNeeded()

    override fun visit(m: MixinModel<*>, p: String): String = m.tableName.inProperCase().quotedIfNeeded()

    override fun visit(m: Alias<*>, p: String): String = m.delegate.accept(this, p) + " AS " + m.alias


    fun String.inProperCase(): String
    fun String.quotedIfNeeded(): String
}