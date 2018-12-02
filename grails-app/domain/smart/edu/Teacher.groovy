package smart.edu

class Teacher {

    String name
    String teacherId
    String contactNo

    static constraints = {
        contactNo(nullable: true)
    }
}
