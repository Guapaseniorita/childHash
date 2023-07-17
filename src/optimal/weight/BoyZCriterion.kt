package optimal.weight

import optimal.Optimal

class BoyZCriterion : Optimal() {
    init {
        optimal["0.0.0"] = "150 ± 150 г"
        optimal["0.0.1"] = "250 ± 100 г"
        optimal["0.0.2"] = "320 ± 80 г"
        optimal["0.0.3"] = "320 ± 80 г"
        optimal["0.0.4"] = "250 - 340 г"
        optimal["0.0.5"] = "230 - 320 г"
        optimal["0.0.6"] = "215 - 290 г"
        optimal["0.0.7"] = "200 -270 г"
        optimal["0.0.8"] = "190 - 250 г"
        optimal["0.0.9"] = "175 - 230 г"
        optimal["0.0.10"] = "165 - 220 г"
        optimal["0.0.11"] = "155 - 200 г"
        optimal["0.0.12"] = "150 - 190 г"
        optimal["0.0.13"] = "140 - 180 г"
        optimal["0.3"] = "560 - 730 г"
        optimal["0.4"] = "430 - 580 г"
        optimal["0.5"] = "370 - 510 г"
        optimal["0.6"] = "280 - 430 г"
        optimal["0.7"] = "240 - 390 г"
        optimal["0.8"] = "220 - 360 г"
        optimal["0.9"] = "200 - 330 г"
        optimal["0.10"] = "190 - 320 г"
        optimal["0.11"] = "180 - 300 г"
        optimal["1.0"] = "180 - 290 г"
    }

    fun getRate(age: String?): String {
        return "Планируемая прибавка в весе: " + optimal[age]
    }
}