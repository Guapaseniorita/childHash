import bodymassindex.BodyMassIndex
import bodymassindex.boy.BoyBMIReferenceData
import bodymassindex.girl.GirlBMIReferenceData
import headСircumference.boy.BoyHeadCircReferenceData
import headСircumference.girl.GirlHeadCircReferenceData
import height.boy.BoyHeightReferenceData
import height.girl.GirlHeightReferenceData
import optimal.weight.BoyZCriterion
import optimal.weight.GirlZCriterion
import weight.boy.BoyWeightReferenceData
import weight.girl.GirlWeightReferenceData

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Input(2, 3, 2023, 11.1, 84.2, 44.0, true)
        val age = Age().calculateAge(input.year, input.month, input.day)
        val ageX = age.toString()
        println(ageX)
        val f = BodyMassIndex()
        val bmi = f.calculateBMI(input.weight, input.height)
        if (input.boy) {
            val wBoy = BoyWeightReferenceData(input.weight)
            println(wBoy.getMessage(ageX, input.weight))
            val zBoy = BoyZCriterion()
            println(zBoy.getRate(ageX))
            val bmiBoy = BoyBMIReferenceData(bmi)
            println(bmiBoy.getMessage(ageX, bmi))
            val hBoy = BoyHeightReferenceData(input.height)
            println(hBoy.getMessage(ageX, input.height))
            val hcBoy = BoyHeadCircReferenceData(input.headCirc)
            println(hcBoy.getMessage(ageX, input.headCirc))
        } else {
            val wGirl = GirlWeightReferenceData(input.weight)
            println(wGirl.getMessage(ageX, input.weight))
            val zGirl = GirlZCriterion()
            println(zGirl.getRate(ageX))
            val bmiGirl = GirlBMIReferenceData(bmi)
            println(bmiGirl.getMessage(ageX, bmi))
            val hGirl = GirlHeightReferenceData(input.height)
            println(hGirl.getMessage(ageX, input.height))
            val hcGirl = GirlHeadCircReferenceData(input.headCirc)
            println(hcGirl.getMessage(ageX, input.headCirc))
        }
    }
}