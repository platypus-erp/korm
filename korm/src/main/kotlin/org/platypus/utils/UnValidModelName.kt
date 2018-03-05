package org.platypus.utils

class UnValidModelName(modelName: String) : RuntimeException("The models name[$modelName] is not valid")