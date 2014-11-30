package pizzastore

class Order {

    Integer number

    static hasMany = [products : Product]

    static constraints = {
    }
}
