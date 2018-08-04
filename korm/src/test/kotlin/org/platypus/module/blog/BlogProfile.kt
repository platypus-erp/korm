package org.platypus.module.blog

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.entity.Selection
import org.platypus.model.Alias
import org.platypus.model.Model
import org.platypus.module.blog.ProfileGender.getValue
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl


object ProfileGender : Selection<ProfileGender>()

val ProfileGender.MALE by "Male profile"
val ProfileGender.FEMALE by "Female profile"
val ProfileGender.UNKNOW by "Unknow gender profile"

object ProfileModel : Model<ProfileModel>("test.profile") {

    val address: AddressMixin<ProfileModel> = mixin(AddressMixin())

    val age = integer("age")
    val gender = selection("gender", ProfileGender)
    val money = decimal("money")
    val user = one2one("user", UserMokModel) {
        required = true
    }
    val bestPost = revOne2one("bestPost", { BlogPostModel.bestPostProfile })

//    val displayAdresse = api.private("displayAdresse",
//            fun(self: Profile): String? {
////                TODO incule mixin adresse
//                return self.country
//            }
//    )
}

