package org.platypus.visitor

interface ExpressionVisitorPredicate<PARAM> : ExpressionVisitorDefault<PARAM, Boolean>, FieldVisitorDefault<PARAM, Boolean>