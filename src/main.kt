fun main() {
    while(true) {
        println("Enter id: ")
        val id = readln()
        if (id=="quit"){
            break
        }
        println("Enter Name: ")
        val name = readln()
        println("Enter Course: ")
        val course = readln()
        println("Enter Mark: ")
        val mark = readln().toDouble()

        val newStudent = Student(id, name, course, mark)
        println(newStudent)
    }

}