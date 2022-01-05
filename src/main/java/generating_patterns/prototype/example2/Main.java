package generating_patterns.prototype.example2;

import generating_patterns.prototype.example2.shop.CarShop;

public class Main {
    public static void main(String[] args) {
        CarShop carShop = new CarShop();
        CarShop copyCarShop = carShop.copy();
    }
}
