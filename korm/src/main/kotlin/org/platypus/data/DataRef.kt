package org.platypus.data

import org.platypus.PlatypusEnvironment
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.repository.RecordRepositoryImpl
import kotlin.reflect.KProperty

fun <M : Model<M>> M.dataRef(ref: String, loader: (e: PlatypusEnvironment) -> Record<M>): PlatypusRefData<M> {
    return PlatypusRefData(this, ref, loader)
}

class PlatypusRefData<M : Model<M>>(
        private val model: M,
        private val ref: String,
        private val loader: (e: PlatypusEnvironment) -> Record<M>) {
    var element: Record<M>? = null

    operator fun invoke(env: PlatypusEnvironment): Record<M> {
        if (element == null) {
            element = RecordRepositoryImpl(env, this.model).byRef(ref)
            if (element?.empty == false) {
                element = loader(env)
            }
        }
        return element!!
    }
}

class DataRef<M : Model<M>>(val env: PlatypusEnvironment) {
    operator fun PlatypusRefData<M>.getValue(t: DataRef<M>, property: KProperty<*>): Record<M> {
        return this.invoke(env)
    }
}