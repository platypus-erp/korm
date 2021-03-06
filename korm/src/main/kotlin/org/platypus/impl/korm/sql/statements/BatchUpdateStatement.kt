package org.platypus.impl.korm.sql.statements

//class BatchUpdateStatement(val table: IdTable<*>): UpdateStatement(table, null) {
//    val data = ArrayList<Pair<EntityID<*>, SortedMap<TableColumn<*>, Any?>>>()
//
//    override val firstDataSet: List<Pair<TableColumn<*>, Any?>> get() = data.first().second.toList()
//
//    fun addBatch(id: EntityID<*>) {
//        if (data.size < 2 || data.first().second.keys.toList() == data.last().second.keys.toList()) {
//            data.add(id to TreeMap())
//        } else {
//            val different = data.first().second.keys.intersect(data.last().second.keys)
//            error("Some values missing for batch update. Different columns: $different")
//        }
//    }
//
//    override fun <S> update(column: TableColumn<S>, value: Expression<S>) = error("Expressions unsupported in batch update")
//
//    override fun prepareSQL(transaction: Transaction): String =
//         "${super.prepareSQL(transaction)} WHERE ${transaction.identity(table.id)} = ?"
//
//    override fun PreparedStatement.executeInternal(transaction: Transaction): Int = if (data.size == 1) executeUpdate() else executeBatch().sum()
//
//    override fun arguments(): Iterable<Iterable<Pair<IColumnType, Any?>>>
//            = data.map { it.second.map { it.key.columnType to it.value } + (table.id.columnType to it.first) }
//}
//
//class EntityBatchUpdate<ID:Any>(val klass: EntityClass<in ID, Entity<in ID>>) {
//
//    private val data = ArrayList<Pair<EntityID<ID>, SortedMap<TableColumn<*>, Any?>>>()
//
//    fun addBatch(id: EntityID<ID>) {
//        data.add(id to TreeMap())
//    }
//
//    operator fun set(column: TableColumn<*>, value: Any?) {
//        val values = data.last().second
//
//        if (values.containsKey(column)) {
//            error("$column is already initialized")
//        }
//
//        values[column] = column.columnType.valueToDB(value)
//    }
//
//    fun execute(transaction: Transaction): Int {
//        val updateSets = data.filterNot {it.second.isEmpty()}.groupBy { it.second.keys }
//        return updateSets.values.fold(0) { acc, set ->
//            acc + BatchUpdateStatement(klass.table).let {
//                it.data.addAll(set)
//                it.execute(transaction)!!
//            }
//        }
//    }
//}
