package org.platypus.orm.sql.query

import org.platypus.model.Model
import org.platypus.model.field.impl.Many2OneField
import org.platypus.model.field.impl.RealModelField

class FieldUniryPlusImpl<M:Model<M>> : FieldUnaryPlus<M> {
//    override fun <MM : Model<MM>, TM : Model<TM>, F : IModelField<TM, T>, T : Any> Many2OneField<MM, TM>.get(getter: TM.() -> F): F {
//        TODO("not implemented")
//    }

    override fun <M1 : Model<M1>, M2 : Model<M2>> Many2OneField<M, M1>.join(field: M1.() -> Many2OneField<M1, M2>): Join3<M, M1, M2> {
        TODO("not implemented")
    }

//    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>> Join3<M, M1, M2>.join(field: M2.() -> Many2OneField<M2, M3>): Join4<M, M1, M2, M3> {
//        TODO("not implemented")
//    }
//
//    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>> Join4<M, M1, M2, M3>.join(field: M3.() -> Many2OneField<M3, M4>): Join5<M, M1, M2, M3, M4> {
//        TODO("not implemented")
//    }
//
//    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>> Join5<M, M1, M2, M3, M4>.join(field: M4.() -> Many2OneField<M4, M5>): Join6<M, M1, M2, M3, M4, M5> {
//        TODO("not implemented")
//    }
//
//    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>> Join6<M, M1, M2, M3, M4, M5>.join(field: M5.() -> Many2OneField<M5, M6>): Join7<M, M1, M2, M3, M4, M5, M6> {
//        TODO("not implemented")
//    }
//
//    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>> Join7<M, M1, M2, M3, M4, M5, M6>.join(field: M6.() -> Many2OneField<M6, M7>): Join8<M, M1, M2, M3, M4, M5, M6, M7> {
//        TODO("not implemented")
//    }
//
//    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, M8 : Model<M8>> Join8<M, M1, M2, M3, M4, M5, M6, M7>.join(field: M7.() -> Many2OneField<M7, M8>): Join9<M, M1, M2, M3, M4, M5, M6, M7, M8> {
//        TODO("not implemented")
//    }
//
//    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, M8 : Model<M8>, M9 : Model<M9>> Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>.join(field: M8.() -> Many2OneField<M8, M9>): Join10<M, M1, M2, M3, M4, M5, M6, M7, M8, M9> {
//        TODO("not implemented")
//    }

    override fun <T : Any> RealModelField<M, T>.select() {
        TODO("not implemented")
    }

    override fun <M1 : Model<M1>, T : Any> Many2OneField<M, M1>.select(field: M1.() -> RealModelField<M1, T>): RealModelField<M1, T> {
        TODO("not implemented")
    }

    override fun <M1 : Model<M1>, M2 : Model<M2>, T : Any> Join3<M, M1, M2>.select(field: M2.() -> RealModelField<M2, T>): RealModelField<M2, T> {
        TODO("not implemented")
    }

//    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, T : Any> Join4<M, M1, M2, M3>.select(field: M3.() -> RealModelField<M3, T>): RealModelField<M3, T> {
//        TODO("not implemented")
//    }
//
//    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, T : Any> Join5<M, M1, M2, M3, M4>.select(field: M4.() -> RealModelField<M4, T>): RealModelField<M4, T> {
//        TODO("not implemented")
//    }
//
//    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, T : Any> Join6<M, M1, M2, M3, M4, M5>.select(field: M5.() -> RealModelField<M5, T>): RealModelField<M5, T> {
//        TODO("not implemented")
//    }
//
//    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, T : Any> Join7<M, M1, M2, M3, M4, M5, M6>.select(field: M6.() -> RealModelField<M6, T>): RealModelField<M6, T> {
//        TODO("not implemented")
//    }
//
//    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, T : Any> Join8<M, M1, M2, M3, M4, M5, M6, M7>.select(field: M7.() -> RealModelField<M7, T>): RealModelField<M7, T> {
//        TODO("not implemented")
//    }
//
//    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, M8 : Model<M8>, T : Any> Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>.select(field: M8.() -> RealModelField<M8, T>): RealModelField<M8, T> {
//        TODO("not implemented")
//    }
//
//    override fun <M1 : Model<M1>, M2 : Model<M2>, M3 : Model<M3>, M4 : Model<M4>, M5 : Model<M5>, M6 : Model<M6>, M7 : Model<M7>, M8 : Model<M8>, M9 : Model<M9>, T : Any> Join10<M, M1, M2, M3, M4, M5, M6, M7, M8, M9>.select(field: M9.() -> RealModelField<M9, T>): RealModelField<M9, T> {
//        TODO("not implemented")
//    }

    override fun <MM : Model<MM>> RealModelField<MM, *>.unaryPlus() {
        TODO("not implemented")
    }
}