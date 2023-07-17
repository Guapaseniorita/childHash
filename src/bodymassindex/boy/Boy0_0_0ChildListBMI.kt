package bodymassindex.boy

import child.ChildResult

class Boy0_0_0ChildListBMI(bmi: Double) : ChildListBMIBoy() {
    private val age = "0.0.0"

    init {
        list.add(ChildResult(12.3, 14.7))
        list[0].setNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(11.1, 12.2))
        list[1].setLowNorma(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(8.0, 11.0))
        list[2].setBelowNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(14.8, 16.3))
        list[3].setHighNorm(age, optimal, typeInd, bmi, unit, type)
        list.add(ChildResult(16.4, 20.0))
        list[4].setAboveNorm(age, optimal, typeInd, bmi, unit, type)
    }
}