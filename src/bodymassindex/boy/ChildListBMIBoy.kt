package bodymassindex.boy

import child.ChildList
import optimal.Optimal
import optimal.bmi.BoyBMINorma

open class ChildListBMIBoy : ChildList() {
    protected val typeInd = "Индекс массы тела: "
    protected val type = "Оптимальный индекс массы тела: "
    protected val unit = ""
    protected val optimal: Optimal = BoyBMINorma()
}