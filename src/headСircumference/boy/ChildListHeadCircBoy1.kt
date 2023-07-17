package headСircumference.boy

import child.ChildList
import optimal.Optimal
import optimal.headcirc.BoyHeadCircNorma

open class ChildListHeadCircBoy : ChildList() {
    protected val typeInd = "Окружность головы: "
    protected val type = "Оптимальная окружность головы: "
    protected val unit = " см"
    protected val optimal: Optimal = BoyHeadCircNorma()
}