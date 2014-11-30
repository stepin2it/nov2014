package pizzastore

class ProductController {

    static scaffold = true

    def list = {
        def products = Product.findAllByStatus("Available", [sort: "name", order : "asc"])
        def tags = Tag.list(sort: "name", order : "asc")

        return [products : products, tags : tags ]

    }

    def showdetail(int id) {
        if (id == null) {
            redirect(action: 'list')
        }

        def product = Product.findById(id)

        def tags = Tag.list(sort: "name", order : "asc")

        [product : product, tags: tags]
    }


    def listpremium = {
        def products = Product.findAllByStatus("Premium", [sort: "name", order : "asc"])
        def tags = Tag.list(sort: "name", order : "asc")

        return [products : products, tags : tags ]

    }

}
