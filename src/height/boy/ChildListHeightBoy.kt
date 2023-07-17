package height.boy

import child.ChildList
import optimal.Optimal
import optimal.height.BoyHeightNorma

open class ChildListHeightBoy : ChildList() {
    protected val typeInd = "Рост: "
    protected val type = "Оптимальный рост: "
    protected val unit = " см"
    protected val optimal: Optimal = BoyHeightNorma()
}