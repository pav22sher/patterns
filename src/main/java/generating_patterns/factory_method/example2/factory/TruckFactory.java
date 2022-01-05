package generating_patterns.factory_method.example2.factory;

import generating_patterns.factory_method.example2.product.Product;
import generating_patterns.factory_method.example2.product.Truck;

public class TruckFactory extends Factory{
    @Override
    Product createProduct() {
        return new Truck();
    }
}
