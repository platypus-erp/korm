package org.platypus.utils

import java.util.stream.Stream

fun <T> Stream<T?>.filterNotNull(): Stream<T> = this.filter { it != null }.map { it as T }