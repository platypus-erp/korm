package org.platypus.model.functions

import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.model.functions.empty.ApiEmptyNoParamStacker
import org.platypus.model.functions.empty.ApiEmptyParamStacker
import org.platypus.model.functions.multi.ApiMultiNoParamStacker
import org.platypus.model.functions.multi.ApiMultiParamStacker
import org.platypus.model.functions.one.ApiOneNoParamStacker
import org.platypus.model.functions.one.ApiOneParamStacker
import org.platypus.repository.RecordRepository

class ModelFunction<M : Model<M>>(private val m: M) {

    fun <RETURN : Any?> public(funName: String , function: (Bag<M>) -> PublicApiReturn<RETURN>) = ApiMultiNoParamStacker(function).apply {
        methodName = m.modelName + " " + funName
    }

    fun <RETURN : Any?, PARAM : Any> public(funName: String , function: (Bag<M>, PARAM) -> PublicApiReturn<RETURN>) = ApiMultiParamStacker(function).apply {
        methodName = m.modelName + " " + funName
    }

    fun <RETURN : Any?> private(funName: String , function: (Bag<M>) -> RETURN) = ApiMultiNoParamStacker(function).apply {
        methodName = m.modelName + " " + funName
    }

    fun <RETURN : Any?, PARAM : Any> private(funName: String , function: (Bag<M>, PARAM) -> RETURN) = ApiMultiParamStacker(function).apply {
        methodName = m.modelName + " " + funName
    }

    fun <RETURN : Any?> public(funName: String , function: (Record<M>) -> PublicApiReturn<RETURN>) = ApiOneNoParamStacker(function).apply {
        methodName = m.modelName + " " + funName
    }

    fun <RETURN : Any?, PARAM : Any> public(funName: String , function: (Record<M>, PARAM) -> PublicApiReturn<RETURN>) = ApiOneParamStacker(function).apply {
        methodName = m.modelName + " " + funName
    }

    fun <RETURN : Any?> private(funName: String , function: (Record<M>) -> RETURN) = ApiOneNoParamStacker(function).apply {
        methodName = m.modelName + " " + funName
    }

    fun <RETURN : Any?, PARAM : Any?> private(funName: String , function: (Record<M>, PARAM) -> RETURN) = ApiOneParamStacker(function).apply {
        methodName = m.modelName + " " + funName
    }

    fun <RETURN : Any?> public(funName: String , function: (RecordRepository<M>) -> PublicApiReturn<RETURN>) = ApiEmptyNoParamStacker(function).apply {
        methodName = m.modelName + " " + funName
    }

    fun <RETURN : Any?, PARAM : Any> public(funName: String , function: (RecordRepository<M>, PARAM) -> PublicApiReturn<RETURN>) = ApiEmptyParamStacker(function).apply {
        methodName = m.modelName + " " + funName
    }

    fun <RETURN : Any?> private(funName: String , function: (RecordRepository<M>) -> RETURN) = ApiEmptyNoParamStacker(function).apply {
        methodName = m.modelName + " " + funName
    }

    fun <RETURN : Any?, PARAM : Any> private(funName: String , function: (RecordRepository<M>, PARAM) -> RETURN) = ApiEmptyParamStacker(function).apply {
        methodName = m.modelName + " " + funName
    }
}
