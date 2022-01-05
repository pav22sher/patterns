package generating_patterns.factory_method.example2;

import generating_patterns.factory_method.example2.factory.CarFactory;
import generating_patterns.factory_method.example2.factory.Factory;
import generating_patterns.factory_method.example2.factory.TruckFactory;

public class Main {
    public static void main(String[] args) {
        Factory carFactory = new CarFactory();
        carFactory.getInfo();
        Factory truckFactory = new TruckFactory();
        truckFactory.getInfo();
    }
}
