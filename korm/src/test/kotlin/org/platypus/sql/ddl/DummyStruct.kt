package org.platypus.sql.ddl

import org.platypus.model.Model

object DummyModel : Model<DummyModel>("dummy.models") {
    val leakField = internalFields
    fun clear() {
        internalFields.clear()
    }
}

object DummyModel2 : Model<DummyModel2>("dummy.model2") {
    val leakField = DummyModel.internalFields
    fun clear() {
        DummyModel.internalFields.clear()
    }
}
