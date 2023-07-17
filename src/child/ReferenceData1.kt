package child

open class ReferenceData {
    protected var references: HashMap<String, ChildList>

    init {
        references = HashMap()
    }

    fun getMessage(age: String, weight: Double): String? {
        val list = references[age]!!.list
        var message = ""
        for (i in list!!.indices) {
            val result = list[i]
            val range = result.range
            if (range!!.containsDouble(weight)) {
                message = result.message
            }
        }
        return message
    }
}