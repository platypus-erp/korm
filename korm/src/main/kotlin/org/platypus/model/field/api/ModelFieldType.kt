package org.platypus.model.field.api


enum class ModelFieldType {
    MANY_TO_MANY,
    MANY_TO_ONE,
    ONE_TO_MANY,
    ONE_TO_ONE,
    REV_ONE_TO_ONE,
    STRING,
    CHAR,
    INTEGER,
    LONG,
    FLOAT,
    DECIMAL,
    PK,
    UUID,
    DATE_TIME,
    TIME,
    DATE,
    SELECTION,
    ENUM,
    BOOLEAN,
    TEXT,
    BINARY
}

fun ModelFieldType.isRelationalField(): Boolean {
    return this == ModelFieldType.MANY_TO_ONE || this == ModelFieldType.ONE_TO_ONE
}

