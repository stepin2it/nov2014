import pizzashop.Product
import pizzashop.Tag

class BootStrap {

    def init = { servletContext ->
        def tag1 = new Tag(name: 'Onion').save()
        def tag2 = new Tag(name: 'Veggie').save()

        def pizza1 = new Product(name: 'Happy Pizza', description: 'Pizza with onion topping ', status: "Available").save()


        def pizza2 = new Product(name: 'Very Happy Pizza', description: 'Pizza with veggie topping ', status: "Available").save()


    }
    def destroy = {
    }
}





