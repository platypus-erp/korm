package org.platypus.model

import org.platypus.module.base.entities.User
import org.platypus.orm.sql.expression.Expression
import org.platypus.security.ModelRule

interface ModelMetaData<M:Model<M>>{


    fun deleteRule(user:User, expr:Expression<Boolean>):Expression<Boolean>
    fun updateRule(user:User, expr:Expression<Boolean>):Expression<Boolean>
    fun readRule(user:User, expr:Expression<Boolean>):Expression<Boolean>
}

class ModelMetaDataImpl<M:Model<M>> : ModelMetaData<M>{
    private val deleteRules : MutableSet<ModelRule<M>> = HashSet()
    private val readRules : MutableSet<ModelRule<M>> = HashSet()
    private val updateRules : MutableSet<ModelRule<M>> = HashSet()

    fun addRule(rule: ModelRule<M>){
        if (rule.delete){
            deleteRules.add(rule)
        }
        if (rule.read){
            readRules.add(rule)
        }
        if (rule.delete){
            deleteRules.add(rule)
        }
    }

    override fun deleteRule(user: User, expr: Expression<Boolean>): Expression<Boolean> {

    }

    override fun updateRule(user: User, expr: Expression<Boolean>): Expression<Boolean> {
        TODO("not implemented")
    }

    override fun readRule(user: User, expr: Expression<Boolean>): Expression<Boolean> {
        TODO("not implemented")
    }
}