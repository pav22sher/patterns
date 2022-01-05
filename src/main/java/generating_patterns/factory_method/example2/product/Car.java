package generating_patterns.factory_method.example2.product;

public class Car implements Product{
    @Override
    public void getInfo() {
        System.out.println("Информация о машине!");
    }
}
