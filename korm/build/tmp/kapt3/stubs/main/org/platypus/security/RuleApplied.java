package org.platypus.security;

import java.lang.System;

/**
 * * Indicate this method used the rule define for the model
 * * Mostly use for the [RecordRepository], [Record], [Bag] functions
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\t\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0000\u00a8\u0006\u0004"}, d2 = {"Lorg/platypus/security/RuleApplied;", "", "type", "Lorg/platypus/security/RuleType;", "korm"})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Documented()
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
@kotlin.annotation.Repeatable()
@kotlin.annotation.MustBeDocumented()
public abstract @interface RuleApplied {
    
    public abstract org.platypus.security.RuleType type();
}