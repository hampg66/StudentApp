class Student (var id: String, var name: String, var course: String, markIn: Double) {

    var mark = 0.0
        set(newMark) {
            if (newMark in 0.0..100.0) {
                field = newMark
            }
        }

    init {
        mark = markIn
    }

    fun get_grade(): String {
        return when (mark) {
            in 70.0..100.0 -> "First"
            in 60.0..69.0 -> "2/1"
            in 50.0..59.0 -> "2/2"
            in 40.0..49.0 -> "Third"
            in 0.0..39.0 -> "Fail"
            else -> "Invalid input"
        }
    }

    fun didPass(): Boolean {
        return mark in 40.0..100.0
    }

    override fun toString(): String {
        return "Name: $name, Course: $course, Mark: $mark"
    }
}