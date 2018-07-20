package org.platypus.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lorg/platypus/exceptions/ActionType;", "", "(Ljava/lang/String;I)V", "CREATE", "READ", "UPDATE", "DELETE", "OTHER", "korm"})
public enum ActionType {
    /*public static final*/ CREATE /* = new CREATE() */,
    /*public static final*/ READ /* = new READ() */,
    /*public static final*/ UPDATE /* = new UPDATE() */,
    /*public static final*/ DELETE /* = new DELETE() */,
    /*public static final*/ OTHER /* = new OTHER() */;
    
    ActionType() {
    }
}