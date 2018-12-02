package smart.edu

class Institute {

    String name
    String establish
    String address

    static hasMany = [department: Department]

    static constraints = {
        establish(nullable: true)
        establish(nullable: true)
        address(nullable: true)
    }
}
