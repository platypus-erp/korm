package org.platypus.struct

import org.platypus.bag.Bag
import org.platypus.model.MixinModel
import org.platypus.model.Model

class AddressMixin<M : Model<M>> : MixinModel<M>("address.mixin") {
    val street = string("street")
    val zip = string("zip")
    val city = string("city")

    val sayHello = api.private("sayHello",
            fun(rs: Bag<M>, suffix: String?) {
                rs.env.logger.info("Hello " + (suffix ?: "world"))
            }
    )

//    val displayAdress = api.private(
//            fun(self: AddressMixin<E, M>):String {
//                "$self."
//            }
//    )
}


