package headСircumference.girl

import child.ChildList
import optimal.Optimal
import optimal.headcirc.BoyHeadCircNorma
import optimal.headcirc.GirlHeadCircNorma

open class ChildListHeadCircGirl : ChildList() {
    protected val typeInd = "Окружность головы: "
    protected val type = "Оптимальная окружность головы: "
    protected val unit = " см"
    protected val optimal: Optimal = GirlHeadCircNorma()
}