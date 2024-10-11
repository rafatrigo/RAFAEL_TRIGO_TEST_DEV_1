package backend

class Company {

    String name
    String segment

    static constraints = {
        name maxSize: 64, nullable: false, blank: false
        segment maxSize: 64, nullable: false, blank: false
    }
}
