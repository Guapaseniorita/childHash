package optimal

open class Optimal {
    protected var optimal: HashMap<String?, String>

    init {
        optimal = HashMap()
    }

    fun getRate(age: String?, type: String): String {
        return type + optimal[age]
    }
}