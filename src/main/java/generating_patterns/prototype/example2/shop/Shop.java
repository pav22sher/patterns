package generating_patterns.prototype.example2.shop;

public class Shop implements Copyable{
    private int width;
    private int height;

    public Shop() {}
    public Shop(Shop shop) {
        this.width = shop.width;
        this.height = shop.height;
    }

    @Override
    public Shop copy() {
        return new Shop(this);
    }
}
