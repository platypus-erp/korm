package org.platypus.model

import org.platypus.orm.sql.predicate.PredicateField
import org.platypus.security.ModelGroup
import org.platypus.security.ModelRule
import org.platypus.security.PlatypusUser
import org.platypus.utils.MutableStringKeyMap

interface ModelMetaData<M : Model<M>> {


    fun deleteRule(user: PlatypusUser, expr: PredicateField?): PredicateField?
    fun updateRule(user: PlatypusUser, expr: PredicateField?): PredicateField?
    fun readRule(user: PlatypusUser, expr: PredicateField?): PredicateField?
}

class NoModelRuleFound(name: String) : RuntimeException("No model rule found with name $name")

class ModelEraseRuleException(name: String) : RuntimeException("A model rule already found with name $name")

class ModelMetaDataImpl<M : Model<M>> : ModelMetaData<M> {
    private val allRules: MutableStringKeyMap<ModelRule<M>> = HashMap()
    private val allGroups: MutableStringKeyMap<ModelGroup<M>> = HashMap()


    fun addSecurity(security: ModelGroup<M>){
        if (allGroups.put(security.uniqueId, security) != null) {
            throw ModelEraseRuleException(security.name)
        }
    }

    fun addRule(rule: ModelRule<M>) {
        if (allRules.put(rule.uniqueId, rule) != null) {
            throw ModelEraseRuleException(rule.name)
        }
    }

    fun getRule(name: String): ModelRule<M> = allRules[name] ?: throw NoModelRuleFound(name)

    override fun deleteRule(user: PlatypusUser, expr: PredicateField?): PredicateField? {
        return expr
    }

    override fun updateRule(user: PlatypusUser, expr: PredicateField?): PredicateField? {
        return expr
    }

    override fun readRule(user: PlatypusUser, expr: PredicateField?): PredicateField? {
        return expr
    }
}