package pizzashop

class ProductController {

    static scaffold = true
    def list() {
        def products = Product.findAllByStatus("Available", [sort: "name", order : "asc"])

        def suborders = Suborder.list(sort: "suborderNumber", order: "asc")
        def tags = Tag.list(sort: "name", order : "asc")

        String hello = printHelloWorld()

        return [products : products, tags : tags, hello: hello, suborders: suborders]
    }

    public String printHelloWorld() {
        return "Hello";

    }

    def listfiltered() {
        def filteredproducts = Product.findAllByName("Celery", [sort: "name", order: "asc"])

            return [filteredproducts : filteredproducts]

    }

    def showdetail(int id) {
        if (id == null) {
            redirect(action: 'list')
        }

        def product = Product.findById(id)

        [product : product]
    }
}


