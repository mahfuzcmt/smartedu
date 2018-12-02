package smart.edu

class Course {

    String name
    String mnemonic
    Double creditHour

    static constraints = {
        mnemonic(nullable: true)
    }
}
