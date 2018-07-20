package org.platypus.model.functions.compute

import org.platypus.entity.Record
import org.platypus.model.IModel
import org.platypus.model.field.api.ModelField
import org.platypus.model.functions.ApiOneParam
import org.platypus.model.functions.ApiParamExtends
import org.platypus.model.functions.ApiParamOriginal
import org.platypus.model.functions.ApiParamStacker

class ComputeSetExtends<M : IModel<M>, P>(
        funn: ComputeSetExtends<M, P>.(Record<M>, P) -> Unit,
        superStack: ApiOneParam<Record<M>, M, P, Unit>
) : ApiParamExtends<Record<M>, M, P, Unit,
        ComputeSetOriginal<M, P>,
        ComputeSetExtends<M, P>>(
        funn, superStack
)

class ComputeSetOriginal<M : IModel<M>, P>
(originalFunction: (Record<M>, P) -> Unit)
    : ApiParamOriginal<Record<M>, M, P, Unit, ComputeSetOriginal<M, P>, ComputeSetExtends<M, P>>(originalFunction)

class ComputeSetStacker<M : IModel<M>, P : Any>(originalFunction: (Record<M>, P) -> Unit, private val field: ModelField<M, P>
) : ApiParamStacker<Record<M>, M, P, Unit, ComputeSetOriginal<M, P>, ComputeSetExtends<M, P>>(originalFunction) {

    override fun createApiParamOriginal(funn: (Record<M>, P) -> Unit) = ComputeSetOriginal(funn)

    override fun createApiParamExtends(
            funn: ComputeSetExtends<M, P>.(Record<M>, P) -> Unit,
            superStack: ApiOneParam<Record<M>, M, P, Unit>) = ComputeSetExtends(funn, superStack)


}