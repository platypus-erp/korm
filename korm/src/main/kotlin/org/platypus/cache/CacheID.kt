package org.platypus.cache

import org.platypus.entity.Record
import org.platypus.model.Alias
import org.platypus.model.IModel
import org.platypus.model.Model

fun IModel<*>.getModel() = when (this){
    is Model<*> -> this
    is Alias<*> -> this.delegate
    else -> TODO("Don't know what to do")
}
data class ModelID(val model: IModel<*>, val id: Int)
data class ModelIDS(val model: IModel<*>, val ids: List<Int>)

fun ModelIDS.isNotEmpty(): Boolean = ids.isNotEmpty()
fun ModelIDS.isEmpty(): Boolean = ids.isEmpty()
fun ModelIDS.toListID(): List<ModelID> = this.ids.map { this.model of it }

infix fun IModel<*>.of(id: Int): ModelID = ModelID(this.getModel(), id)
fun ModelID.toModelIDS(): ModelIDS = model of listOf(id)

infix fun IModel<*>.of(ids: List<Int>): ModelIDS = ModelIDS(this.getModel(), ids)
val Record<*>.modelID: ModelID get() = ModelID(this.model, this.id)


fun Collection<ModelID>.toModelIDS():ModelIDS = this.first().model of this.map { it.id }