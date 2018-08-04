package org.platypus.model.field.n.api

import org.platypus.model.IModel
import org.platypus.model.functions.compute.ComputeGetStacker
import org.platypus.model.functions.compute.ComputeSetStacker

interface ComputableField<M:IModel<M>, T:Any>{

    val onGet: ComputeGetStacker<M, T>?
    val onSet: ComputeSetStacker<M, T>?
}