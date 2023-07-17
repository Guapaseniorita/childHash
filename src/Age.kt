import java.time.LocalDate
import java.time.Period
import java.time.temporal.ChronoUnit

class Age {
    var year = 0
        private set
    var month = 0
        private set
    var week = 0
        private set

    constructor()
    constructor(year: Int, month: Int, week: Int) {
        this.year = year
        this.month = month
        this.week = week
    }

    override fun toString(): String {
        return if (week <= 13) {
            "0.0.$week"
        } else {
            "$year.$month"
        }
    }

    fun calculateAge(year: Int, month: Int, day: Int): Age {
        val today = LocalDate.now()
        val birthday = LocalDate.of(year, month, day)
        val period = Period.between(birthday, today)
        val ageInWeek = ChronoUnit.WEEKS.between(birthday, today).toInt()
        val ageInMonth = period.months
        val ageInYear = period.years
        return Age(ageInYear, ageInMonth, ageInWeek)
    }
}