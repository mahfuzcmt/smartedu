package smart.edu

class Student {

    String name
    String studentId
    String contactNo

    static constraints = {
        contactNo(nullable: true)
    }
}
