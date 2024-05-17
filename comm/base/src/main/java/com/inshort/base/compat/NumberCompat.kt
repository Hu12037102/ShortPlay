package com.inshort.base.compat

import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

object NumberCompat {
    @JvmStatic
    fun keepDecimalNumber(
        number: Double,
        keepCount: Int = 2,
        defaultNumber: String = ""
    ): String =
        try {
            if (keepCount > 0) {
                val pattern = StringBuilder("#0.")
                for (i in 0 until keepCount) {
                    pattern.append("0")
                }
                val df = DecimalFormat(pattern.toString(), DecimalFormatSymbols(Locale.US))
                df.format(number)
            } else {
                defaultNumber
            }
        } catch (e: Exception) {
            e.printStackTrace()
            defaultNumber
        }

    @JvmStatic
    fun getHotText(hotValue: String?, defaultValue: String = "1k"): String =
        kotlin.runCatching {
            val numberDecimal = BigDecimal(hotValue)
            val oneB = BigDecimal(1000000000)
            val oneM = BigDecimal(1000000)
            val oneK = BigDecimal(1000)
            val resultB = numberDecimal.divide(oneB, 1, RoundingMode.HALF_UP)
            val result = if (resultB.toDouble() >= 1) {
                keepDecimalNumber(
                    resultB.toDouble(),
                    1,
                    defaultNumber = defaultValue
                )/*.replace(".0", "")*/ + "B"
            } else {
                val resultM = numberDecimal.divide(oneM, 1, RoundingMode.HALF_UP)
                if (resultM.toDouble() >= 1) {
                    keepDecimalNumber(
                        resultM.toDouble(),
                        1,
                        defaultNumber = defaultValue
                    )/*.replace(".0", "") */+ "M"
                } else {
                    val resultK = numberDecimal.divide(oneK,1, RoundingMode.HALF_UP)
                    if (resultK.toDouble()>=1){
                        keepDecimalNumber(
                            numberDecimal.divide(oneK, 1, RoundingMode.HALF_UP).toDouble(),
                            1,
                            defaultNumber = defaultValue
                        )/*.replace(".0", "")*/ + "K"
                    }else{
                        "${numberDecimal.toInt()}"
                    }

                }
            }
            result
        }.getOrDefault(defaultValue)
}