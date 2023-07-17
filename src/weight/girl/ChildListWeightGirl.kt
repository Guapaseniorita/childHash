package weight.girl

import child.ChildList
import optimal.Optimal
import optimal.weight.GirlWeightNorma

open class ChildListWeightGirl : ChildList(){
        protected val typeInd = "Вес: "
        protected val type = "Оптимальный вес: "
        protected val unit = " кг"
        protected val optimal: Optimal = GirlWeightNorma()

}