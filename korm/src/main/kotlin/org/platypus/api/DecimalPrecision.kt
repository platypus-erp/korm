package org.platypus.api

import java.math.RoundingMode

class DecimalPrecision(val precision:Int, val scale:Int, val roundMethod:RoundingMode = RoundingMode.UP)