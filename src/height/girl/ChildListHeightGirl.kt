package height.girl

import child.ChildList
import optimal.Optimal
import optimal.height.BoyHeightNorma
import optimal.height.GirlHeightNorma

open class ChildListHeightGirl : ChildList() {
    protected val typeInd = "Рост: "
    protected val type = "Оптимальный рост: "
    protected val unit = " см"
    protected val optimal: Optimal = GirlHeightNorma()
}