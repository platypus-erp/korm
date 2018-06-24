package org.platypus.security

enum class RuleType{
    READ,WRITE,DELETE
}


@MustBeDocumented
@Repeatable
@Retention(AnnotationRetention.SOURCE)
/**
 * Indicate this method used the rule define for the model
 * Mostly use for the [RecordRepository], [Record], [Bag] functions
 */
annotation class RuleApplied(val type:RuleType)