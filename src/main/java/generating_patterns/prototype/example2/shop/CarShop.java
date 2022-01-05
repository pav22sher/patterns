package generating_patterns.prototype.example2.shop;

public class CarShop extends Shop{
    boolean parking;

    public CarShop() {}

    public CarShop(CarShop carShop) {
        super(carShop);
        this.parking = carShop.parking;
    }

    @Override
    public CarShop copy() {
        return new CarShop(this);
    }
}
