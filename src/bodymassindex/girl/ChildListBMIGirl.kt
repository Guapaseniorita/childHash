package bodymassindex.girl

import child.ChildList
import optimal.Optimal
import optimal.bmi.GirlBMINorma

open class ChildListBMIGirl : ChildList() {
    protected val typeInd = "Индекс массы тела: "
    protected val type = "Оптимальный индекс массы тела: "
    protected val unit = ""
    protected val optimal: Optimal = GirlBMINorma()
}