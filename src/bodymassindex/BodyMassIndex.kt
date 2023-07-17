package bodymassindex

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

class BodyMassIndex {
    fun calculateBMI(weight: Double, height: Double): Double {
        val heightSm = height / 100
        val result = weight / Math.pow(heightSm, 2.0)
        val symbols = DecimalFormatSymbols(Locale.getDefault())
        symbols.decimalSeparator = '.'
        val df = DecimalFormat("#.#", symbols)
        val formattedResult = df.format(result)
        return formattedResult.toDouble()
    }
}