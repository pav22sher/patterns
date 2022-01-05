package generating_patterns.prototype.example1.shape;

public class Rectangle extends Shape{
    public int width;
    public int height;

    public Rectangle() {}

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        if (rectangle != null) {
            this.width = rectangle.width;
            this.height = rectangle.height;
        }
    }
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
