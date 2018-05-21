package org.platypus.security

import org.platypus.model.Model
import org.platypus.module.base.entities.Group
import org.platypus.orm.sql.expression.Expression

class ModelRule<M : Model<M>>(
        val uniqueId:String,
        val name:String,
        val read: Boolean,
        val write: Boolean,
        val delete: Boolean,
        val rule: (M) -> Expression<Boolean>
)

class ModelRuleBuilder<M : Model<M>>(val model:M, val uniqueId:String){
    var read:Boolean = false
    var name:String = ""
    var write:Boolean = false
    var delete:Boolean = false
    var rule:((M) -> Expression<Boolean>)? = null
}
data class ModelGroup<M : Model<M>>(
        val model:M,
        val create:Boolean,
        val read: Boolean,
        val write: Boolean,
        val delete: Boolean,
        val groups: Set<Group>
)

class ModelGroupBuilder<M : Model<M>>(val model:M){
    var create:Boolean = false
    var read:Boolean = false
    var write:Boolean = false
    var delete:Boolean = false
    var groups: Set<Group> = emptySet()
}