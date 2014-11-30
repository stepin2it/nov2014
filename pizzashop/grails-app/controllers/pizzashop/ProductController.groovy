package pizzashop

class ProductController {

    static scaffold = true
    def list() {
        def products = Product.findAllByStatus("Available", [sort: "name", order : "asc"])

        def tags = Tag.list(sort: "name", order : "asc")

        return [products : products, tags : tags ]
    }

    def listfiltered() {
        def filteredproducts = Product.findAllByName("Celery", [sort: "name", order: "asc"])

            return [filteredproducts : filteredproducts]

    }

}


