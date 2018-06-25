package org.platypus.orm.sql.query

import org.platypus.PlatypusEnvironment
import org.platypus.model.Model


fun <M : Model<M>> PlatypusEnvironment.buildSelect(model: M, builer: SearchQuery<M>.(M) -> Unit): Query {
    val smb = SearchQueryImpl(model, this)
    smb.builer(model)
    return smb.buildQuery(this)
}

