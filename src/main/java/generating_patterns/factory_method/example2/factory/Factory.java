package generating_patterns.factory_method.example2.factory;

import generating_patterns.factory_method.example2.product.Product;

public abstract class Factory {
    public void getInfo() {
        Product product = createProduct();
        product.getInfo();
    }
    abstract Product createProduct();
}
