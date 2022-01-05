package generating_patterns.factory_method.example2.factory;

import generating_patterns.factory_method.example2.product.Car;
import generating_patterns.factory_method.example2.product.Product;

public class CarFactory extends Factory{
    @Override
    Product createProduct() {
        return new Car();
    }
}
