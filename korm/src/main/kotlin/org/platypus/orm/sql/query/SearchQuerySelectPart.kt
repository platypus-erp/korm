package org.platypus.orm.sql.query

import kotlinx.coroutines.experimental.NonCancellable.children
import org.platypus.model.IModel
import org.platypus.model.Model
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.impl.Many2OneField
import org.platypus.model.field.impl.RealModelField
import org.platypus.orm.PersistenceDialect
import org.platypus.orm.sql.QueryBuilder
import org.platypus.utils.enter
import org.platypus.utils.space
import org.platypus.utils.token

interface SearchQuerySelectPart : FieldGetter, StatementPart {
    operator fun <MM : Model<MM>> RealModelField<MM, *>.unaryPlus()
}

class SearchQuerySelectPartImpl<M : Model<M>>(
        private val model: M,
        private val count: Boolean = false,
        private val distinct: Boolean = false
) : SearchQuerySelectPart {

    private val joins = HashSet<JoinPart>()
    private val projection = ProjectionSelectPart(AliasModel(model, "from_" + model.modelName))
    private var lastJoinPart: JoinPart? = null
    private val pathStack = HashMap<String, PathStack>()

    init {
        pathStack[model.modelName] = PathStack(null,
                ProjectionSelectPart(AliasModel(model, "from_" + model.modelName)),
                null)
    }

    private var currentPath = model.modelName


    override fun prepareSQL(dialect: PersistenceDialect, builder: QueryBuilder): String = buildString {
        token("SELECT")
        enter()
        if (count) {
            token("COUNT(*)")
            enter()
        } else {
            if (distinct) {
                token("DISTINCT")
                enter()
            }
            pathStack.values.
            joins.joinTo(this, separator = ",\n") {
                it.projection.prepareSQL(dialect, builder)
            }
            append(",\n")
            append(projection.prepareSQL(dialect, builder))
        }
        enter()
        token("FROM")
        append(projection.alias.prepareSQL(dialect, builder))
        append(dialect.identity(model))
        enter()
        for (fieldToJoin in joins) {
            append(fieldToJoin.prepareSQL(dialect, builder))
        }
    }

    override fun <MM : Model<MM>, TM : Model<TM>, F : IModelField<TM, T>, T : Any> Many2OneField<MM, TM>.get(getter: TM.() -> F): F {
        val newPath = currentPath + "#" + this.fieldName
        val stack = pathStack[newPath]
        if (stack == null) {
            pathStack[newPath] = PathStack(this,
                    ProjectionSelectPart(AliasModel(model, newPath)).apply {
                        select.add(this@get)
                    },
                    pathStack[currentPath]!!
            )
        }
        currentPath = newPath
        return this.target.getter()
    }

    override fun <MM : Model<MM>> RealModelField<MM, *>.unaryPlus() {
        val stack = pathStack[currentPath]
        if (stack != null) {
            stack.projection.select.add(this)
        } else {
            throw IllegalStateException("No path Stack")
        }
        currentPath = this@SearchQuerySelectPartImpl.model.modelName
    }
}

private class PathStack(
        val field: Many2OneField<*, *>?,
        val projection: ProjectionSelectPart,
        val previous: PathStack?
): StatementPart{
    override fun prepareSQL(dialect: PersistenceDialect, builder: QueryBuilder): String = buildString {
        var prev = previous
        while (prev != null){
            prev.toSql(dialect, builder)
            prev = prev.previous
        }

        for (fieldToJoin in previous) {
            append(fieldToJoin.toSql(dialect, builder))
        }
        append(toSql(dialect, builder))
    }

    private fun toSql(dialect: PersistenceDialect, builder: QueryBuilder): String = buildString {
        space(2)
        if (field!!.required) {
            token("INNER")
        } else {
            token("LEFT")
        }
        token("JOIN")
        append(dialect.identity(field.target))
        token(" AS")
        token(projection.alias.alias)
        token("ON")
        append(field.accept(dialect.expressionVisitor, builder))
        append(" = ")
        append(field.target.id.accept(dialect.expressionVisitor, builder))
        enter()
    }
}

private class JoinPart(
        val field: Many2OneField<*, *>, private val num: Int
) : StatementPart {
    val children = HashSet<JoinPart>()
    val projection = ProjectionSelectPart(
            alias = AliasModel(field.target, this.field.target.tableName + "_" + this.field.fieldName))

    val alias: String
        get() = this.field.target.tableName + "_" + this.field.fieldName

    override fun prepareSQL(dialect: PersistenceDialect, builder: QueryBuilder): String = buildString {
        append(toSSql(dialect, builder))
        for (fieldToJoin in children) {
            append(fieldToJoin.toSSql(dialect, builder))
        }
    }

    private fun toSSql(dialect: PersistenceDialect, builder: QueryBuilder): String = buildString {
        space(2)
        if (field.required) {
            token("INNER")
        } else {
            token("LEFT")
        }
        token("JOIN")
        append(dialect.identity(field.target))
        token(" AS")
        token(alias)
        token("ON")
        append(field.accept(dialect.expressionVisitor, builder))
        append(" = ")
        append(field.target.id.accept(dialect.expressionVisitor, builder))
        enter()
    }
}

private class ProjectionSelectPart(
        val alias: AliasModel
) : StatementPart {

    val select = HashSet<RealModelField<*, *>>()

    override fun prepareSQL(dialect: PersistenceDialect, builder: QueryBuilder): String = buildString {
        select.joinTo(this, separator = ",\n") {
            space(2)
            alias.alias + "." + dialect.identity(it)
        }
    }
}

private class AliasModel(private val model: IModel<*>, val alias: String) : StatementPart {
    override fun prepareSQL(dialect: PersistenceDialect, builder: QueryBuilder): String {
        return dialect.identity(model) + " AS " + alias
    }
}