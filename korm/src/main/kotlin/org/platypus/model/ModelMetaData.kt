package org.platypus.model

import org.platypus.module.base.entities.User
import org.platypus.orm.sql.expression.Expression
import org.platypus.security.ModelRule
import org.platypus.utils.MutableStringKeyMap

interface ModelMetaData<M : Model<M>> {


    fun deleteRule(user: User, expr: Expression<Boolean>): Expression<Boolean>
    fun updateRule(user: User, expr: Expression<Boolean>): Expression<Boolean>
    fun readRule(user: User, expr: Expression<Boolean>): Expression<Boolean>
}
class NoModelRuleFound(name:String):RuntimeException("No model rule found with name $name")
class ModelEraseRuleException(name:String):RuntimeException("A model rule already found with name $name")
class ModelMetaDataImpl<M : Model<M>> : ModelMetaData<M> {
    private val deleteRules: MutableStringKeyMap<ModelRule<M>> = HashMap()
    private val readRules: MutableStringKeyMap<ModelRule<M>> = HashMap()
    private val updateRules: MutableStringKeyMap<ModelRule<M>> = HashMap()
    private val allRules: MutableStringKeyMap<ModelRule<M>> = HashMap()

    fun addRule(rule: ModelRule<M>) {
        if (allRules.put(rule.uniqueId, rule) != null){
            throw ModelEraseRuleException(rule.name)
        }
    }

    fun getRule(name:String):ModelRule<M> = allRules[name] ?: throw NoModelRuleFound(name)

    override fun deleteRule(user: User, expr: Expression<Boolean>): Expression<Boolean> {
        TODO("not implemented")
    }

    override fun updateRule(user: User, expr: Expression<Boolean>): Expression<Boolean> {
        TODO("not implemented")
    }

    override fun readRule(user: User, expr: Expression<Boolean>): Expression<Boolean> {
        TODO("not implemented")
    }
}