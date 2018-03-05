package org.platypus.utils

import java.util.stream.Stream

fun <K, V> Map<K, V>.stream(): Stream<Map.Entry<K, V>> = this.entries.stream()
