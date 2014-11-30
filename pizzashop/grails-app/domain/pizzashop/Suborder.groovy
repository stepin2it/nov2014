package pizzashop

class Suborder {

    Integer suborderNumber
    static belongsTo = Order
    static constraints = {
        suborderNumber blank : false, unique: true
    }
}
