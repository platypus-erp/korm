package org.platypus;

import java.lang.System;

/**
 * * I don't like the implementation of this element but currently its work
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\n\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003R\t\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0000\u00a8\u0006\u0004"}, d2 = {"Lorg/platypus/IShouldImprovedThis;", "", "why", "", "korm"})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
public abstract @interface IShouldImprovedThis {
    
    public abstract java.lang.String why() default "I can do better";
}