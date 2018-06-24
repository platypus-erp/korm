package org.platypus.bag

import org.platypus.Environmentable
import org.platypus.ExecuteAutoLoad
import org.platypus.INeedToDocumentThis
import org.platypus.INeedToTestThis
import org.platypus.IShouldRefractorThis
import org.platypus.LazyLoaded
import org.platypus.MutateSelf
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.MultiReferencedField
import org.platypus.model.field.api.ReferencedField
import org.platypus.model.field.api.SimpleModelField
import org.platypus.model.field.impl.RealModelField
import org.platypus.orm.sql.query.ORDERBY_TYPE





@INeedToTestThis
@INeedToDocumentThis
@LazyLoaded
interface Bag<M : Model<M>> : List<Record<M>>, Environmentable {
    /**
     * The ids of the element containing by the Bag
     * The ids can be empty if this is an empty Bag or if the [loaded] is false
     */
    @ExecuteAutoLoad
    val ids: Collection<Int>

    /**
     * The model of the Bag
     */
    val model: M

    /**
     *  True if the Bag has been loaded in the cache
     */
    val loaded: Boolean


    /**
     * filter the current record and return the result in a new Bag
     */
    @ExecuteAutoLoad
    fun filter(predicate: (Record<M>) -> Boolean): Bag<M>

    /**
     * Change the order of the Bag internally
     * If the Bag is [loaded] then the order is only executed in memory equivalent to the [sort] functuon
     * Otherwise the odrer clause is change to ORDER BY [column] [orderBy] an will be executed in the load
     */
    @MutateSelf
    fun orderBy(column: ModelField<M, Any>, orderBy: ORDERBY_TYPE = ORDERBY_TYPE.ASC): Bag<M>

    /**
     * Change the order of the Bag internally
     * If the Bag is [loaded] then the order is only executed in memory equivalent to the [sort] functuon
     * Otherwise the odrer clause is change to ORDER BY [column] [orderBy], * nb [columns] an will be executed in the load
     */
    @MutateSelf
    fun orderBy(vararg columns: Pair<ModelField<M, Any>, ORDERBY_TYPE>): Bag<M>

    /**
     * Change the order of the Bag internally
     * If the Bag is [loaded] then the order is only executed in memory equivalent to the [sort] functuon
     * Otherwise the odrer clause is change to ORDER BY [column] [orderBy], * nb [columns] an will be executed in the load
     */
    @MutateSelf
    fun orderBy(columns: List<Pair<ModelField<M, Any>, ORDERBY_TYPE>>): Bag<M>

    /**
     * Limit the number of record loaded by this bag
     * If the Bag is [loaded] then the [limit] and [offset] is only executed in memory equivalent to the [List.subList] functuon
     * Otherwise the limit, offset clause is added or changed in the internal Query
     */
    @MutateSelf
    fun limit(limit: Int, offset: Int = 0): Bag<M>

    /**
     * Add a field to load, because bag can load only a subset of field if needed.
     * If durring the iteration of the bag a un loaded field is called then a query is executed to load all the unloaded field
     * To use carefully
     */
    @MutateSelf
    fun addField(f: RealModelField<M, *>): Bag<M>

    /**
     * Add a OR in the internal query
     */
    @MutateSelf
    fun or()

    /**
     * Add a AND in the internal query
     */
    @MutateSelf
    fun and()

    @ExecuteAutoLoad
    fun deleteIf(filter: (Record<M>) -> Boolean): Bag<M>

    /**
     * Delete all this bag from the persistence layer
     *
     * @return the number of deleted record
     */
    @MutateSelf
    fun delete(): Int


    /**
     * Create a new bag with the current bag + [other]
     */
    operator fun plus(other: Record<M>): Bag<M>

    /**
     * Create a new bag with the current bag + [other]
     */
    operator fun plus(other: Bag<M>): Bag<M>

    /**
     * Create a new bag with the current bag - [other]
     */
    operator fun minus(other: Record<M>): Bag<M>

    /**
     * Create a new bag with the current bag - [other]
     */
    operator fun minus(other: Bag<M>): Bag<M>

    /**
     * Make a clone of this bag
     */
    @IShouldRefractorThis("don'tknow if usefull")
    fun clone(): Bag<M> = this

    fun <T : Any> mapped(field: SimpleModelField<M, T>): List<T>
    fun <MT : Model<MT>> mapped(field: ReferencedField<M, MT>): Bag<MT>
    fun <MT : Model<MT>> mapped(field: MultiReferencedField<M, MT>): Bag<MT>


}