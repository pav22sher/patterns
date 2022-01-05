package structural_patterns.adapter.example2.animal;

public class Camel implements Animal{
    @Override
    public void move() {
        System.out.println("Верблюд идет по пескам пустыни!");
    }
}
