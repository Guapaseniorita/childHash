package optimal.weight

import optimal.Optimal

class GirlZCriterion : Optimal() {
    init {
        optimal["0.0.0"] = "100 ± 100 г"
        optimal["0.0.1"] = "200 ± 100 г"
        optimal["0.0.2"] = "270 ±  70 г"
        optimal["0.0.3"] = "270  ±  70 г"
        optimal["0.0.4"] = "210 - 300 г"
        optimal["0.0.5"] = "200 - 280 г"
        optimal["0.0.6"] = "180 - 260 г"
        optimal["0.0.7"] = "170 - 240 г"
        optimal["0.0.8"] = "160 - 230 г"
        optimal["0.0.9"] = "150 - 220 г"
        optimal["0.0.10"] = "140 - 200 г"
        optimal["0.0.11"] = "130 - 195 г"
        optimal["0.0.12"] = "125 - 185 г"
        optimal["0.0.13"] = "120 - 175 г"
        optimal["0.3"] = "490 - 710 г"
        optimal["0.4"] = "390 - 580 г"
        optimal["0.5"] = "340 - 500 г"
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