package pizzashop

class Order {

    String number
    // static hasMany = [suborders : Suborder]
    static constraints = {
        number blank : false, unique: true
    }
}
