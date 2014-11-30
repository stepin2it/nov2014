import pizzashop.Product
import pizzashop.Tag
import pizzashop.Order

class BootStrap {

    def init = { servletContext ->
        def tag1 = new Tag(name: 'Celery', description: 'Celery topping').save()
        def tag2 = new Tag(name: 'Cilantro', description: 'Cilantro').save()

        def pizza1 = new Product(name: 'Celery Pizza', description: 'Pizza with celery topping ', status: "Available")
        // TODO Figure out why this doesn't work
        // pizza1.addToTags(tag : tag1)
        pizza1.save()


        def pizza2 = new Product(name: 'Cilantro Pizza', description: 'Pizza with cilantro topping ', status: "Available")
        // pizza2.addToTags(tag : tag2)
        pizza2.save()

        // def order1 = new Order(orderNumber: 1, createdDate: new Date()).save()
        // def order2 = new Order(orderNumber: 2, createdDate: new Date()).save()
        // def order3 = new Order(orderNumber: 3, createdDate: new Date()).save()


    }
    def destroy = {
    }
}





