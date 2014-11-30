import pizzastore.Product
import pizzastore.Tag

// import org.apache.shiro.crypto.hash.Sha256Hash
class BootStrap {

    /*
    def init = { servletContext ->
        def user = new ShiroUser(username: "user123", passwordHash: new Sha256Hash("password").toHex())
        user.addToPermissions("*:*")
        user.save()
    }
    */
    def init = { servletContext ->

        def tomatoTag = new Tag(name: 'Tomato').save()
        def mushroomTag = new Tag(name: 'Mushroom').save()

        def tomatoPizza = new Product(name: 'Tomato Pizza', description: 'Pizza with tomato topping ', status: "Available").save()
        // tomatoPizza.addToTags(tomatoTag)
        def mushroomPizza = new Product(name: 'Mushroom Pizza', description: 'Pizza with mushroom topping ', status: "Available").save()
        // mushroomPizza.addToTags(mushroomTag)

    }

    def destroy = {
    }
}