package smart.edu

class Department {

    String name
    String mnemonic
    String establish

    static constraints = {
        mnemonic(nullable: true)
        establish(nullable: true)
    }
}
