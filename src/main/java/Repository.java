public class Repository {
    Product[] products = new Product[0];

    public Product[] giveAll() {
        return products;
    }

    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1];

        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public void removeById(int id) {
        Product searchedProduct = findById(id);

        if (searchedProduct == null) {
            throw new NotFoundException(
                    "Продукта с введённым вами ID не существует, вы ввели ID: " + id
            );
        }

        Product[] tmp = new Product[products.length - 1];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[index] = product;
                index = index + 1;
            }
        }
        products = tmp;
    }

    public Product findById(int id) {

        Product[] tmp = new Product[products.length - 1];
        int index = 0;
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

}

