package height.boy

import child.ChildResult

class Boy0_0_0ChildListHeight(height: Double) : ChildListHeightBoy() {
    private val age = "0.0.0"

    init {
        list.add(ChildResult(48.1, 51.7))
        list[0].setNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(46.1, 48.0))
        list[1].setLowNorma(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(30.0, 46.0))
        list[2].setBelowNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(51.8, 53.7))
        list[3].setHighNorm(age, optimal, typeInd, height, unit, type)
        list.add(ChildResult(53.8, 130.0))
        list[4].setAboveNorm(age, optimal, typeInd, height, unit, type)
    }
}