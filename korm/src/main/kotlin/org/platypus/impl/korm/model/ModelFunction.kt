package org.platypus.impl.korm.model

import com.sun.org.apache.bcel.internal.generic.RETURN
import org.platypus.impl.korm.entity.Bag
import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.entity.PlatypusEntity
import org.platypus.impl.korm.entity.PlatypusEntityGetter
import org.platypus.impl.korm.model.functions.PublicApiReturn
import org.platypus.impl.korm.model.functions.empty.ApiEmptyNoParamStacker
import org.platypus.impl.korm.model.functions.empty.ApiEmptyParamStacker
import org.platypus.impl.korm.model.functions.empty.ApiMultiNoParamStacker
import org.platypus.impl.korm.model.functions.empty.ApiMultiParamStacker
import org.platypus.impl.korm.model.functions.one.ApiOneNoParamStacker
import org.platypus.impl.korm.model.functions.one.ApiOneParamStacker
import org.platypus.impl.korm.model.property.KormProperty


class ModelFunction<RECIEVER : Entity<RECIEVER, M>, M : BaseModel<M, RECIEVER>>(private val m: M) {


    fun <RETURN : Any?> public(function: (Bag<RECIEVER>) -> PublicApiReturn<RETURN>) = ApiMultiNoParamStacker(function)

    fun <RETURN : Any?, PARAM : Any> public(function: (Bag<RECIEVER>, PARAM) -> PublicApiReturn<RETURN>) = ApiMultiParamStacker(function)

    fun <RETURN : Any?> private(function: (Bag<RECIEVER>) -> RETURN) = ApiMultiNoParamStacker(function)

    fun <RETURN : Any?, PARAM : Any> private(function: (Bag<RECIEVER>, PARAM) -> RETURN) = ApiMultiParamStacker(function)

    fun <RETURN : Any?> public(function: (RECIEVER) -> PublicApiReturn<RETURN>) = ApiOneNoParamStacker(function)

    fun <RETURN : Any?, PARAM : Any> public(function: (RECIEVER, PARAM) -> PublicApiReturn<RETURN>) = ApiOneParamStacker(function)

    fun <RETURN : Any?> private(function: (RECIEVER) -> RETURN) = ApiOneNoParamStacker(function)

    fun <RETURN : Any?, PARAM : Any> private(function: (RECIEVER, PARAM) -> RETURN) = ApiOneParamStacker(function)

    fun <T : PlatypusEntityGetter<RECIEVER, M>, RETURN : Any?> public(function: (T) -> PublicApiReturn<RETURN>) = ApiEmptyNoParamStacker(function)

    fun <T : PlatypusEntityGetter<RECIEVER, M>, RETURN : Any?, PARAM : Any> public(function: (T, PARAM) -> PublicApiReturn<RETURN>) = ApiEmptyParamStacker(function)

    fun <T : PlatypusEntityGetter<RECIEVER, M>, RETURN : Any?> private(function: (T) -> RETURN) = ApiEmptyNoParamStacker(function)

    fun <T : PlatypusEntityGetter<RECIEVER, M>, RETURN : Any?, PARAM : Any> private(function: (T, PARAM) -> RETURN) = ApiEmptyParamStacker(function)


    fun <T : Any?> compute(prop: KormProperty<M, T>, function: (RECIEVER) -> PublicApiReturn<T>) = ApiOneNoParamStacker(function)
    fun <T : Any?> onChange(prop: KormProperty<M, T>, function: (RECIEVER) -> PublicApiReturn<T>) = ApiOneNoParamStacker(function)

}