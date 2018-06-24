package org.platypus.cache

import org.platypus.entity.Record
import org.platypus.model.IModel

data class ModelID(val model: IModel<*>, val id: Int)
data class ModelIDS(val model: IModel<*>, val ids: List<Int>)

fun ModelIDS.isNotEmpty(): Boolean = ids.isNotEmpty()
fun ModelIDS.isEmpty(): Boolean = ids.isEmpty()
fun ModelIDS.toListID(): List<ModelID> = this.ids.map { this.model of it }

infix fun IModel<*>.of(id: Int): ModelID = ModelID(this, id)
fun ModelID.toModelIDS(): ModelIDS = model of listOf(id)

infix fun IModel<*>.of(ids: List<Int>): ModelIDS = ModelIDS(this, ids)
val Record<*>.modelID: ModelID get() = ModelID(this.model, this.id)


fun Collection<ModelID>.toModelIDS():ModelIDS = this.first().model of this.map { it.id }