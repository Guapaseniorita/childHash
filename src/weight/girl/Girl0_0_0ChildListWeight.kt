package weight.girl

import child.ChildResult

class Girl0_0_0ChildListWeight(weight: Double) : ChildListWeightGirl() {
    private val age = "0.0.0"

    init {
        list.add(ChildResult(2.9, 3.6))
        list[0].setNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.4, 2.8))
        list[1].setLowNorma(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(2.0, 2.3))
        list[2].setBelowNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(3.7, 4.2))
        list[3].setHighNorm(age, optimal, typeInd, weight, unit, type)
        list.add(ChildResult(4.3, 6.0))
        list[4].setAboveNorm(age, optimal, typeInd, weight, unit, type)
    }
}

