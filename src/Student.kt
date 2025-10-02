class Student (var id: String, var name: String, var course: String, var mark: Double) {

    override fun toString(): String {
        return "Name: $name, Course: $course, Mark: $mark"
    }
}