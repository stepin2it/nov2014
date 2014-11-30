import org.apache.shiro.crypto.hash.Sha256Hash
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

        def tag1 = new Tag(name: 'Cilantro', description: 'Cilantro').save()
        def tag2 = new Tag(name: 'Celery', description: 'Celery').save()

        def pizza1 = new Product(name: 'Cilantro Pizza', description: 'Pizza with cilantro topping ', status: "Available").save()
        pizza1.addToTags(tag1)
        def pizza2 = new Product(name: 'Celery Pizza', description: 'Pizza with celery topping ', status: "Available").save()
        pizza2.addToTags(tag2)

        def user = new ShiroUser(username: "user123", passwordHash: new Sha256Hash("password").toHex())
        user.addToPermissions("*:*")
        user.save()

    }

    def destroy = {
    }
}