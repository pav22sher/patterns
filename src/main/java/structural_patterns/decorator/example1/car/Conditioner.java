package structural_patterns.decorator.example1.car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Conditioner extends Decorator{
    private Car car;
    @Override
    public int getPrice() {
        return car.getPrice() + 1000;
    }

    @Override
    public String getInfo() {
        return car.getInfo() + " + Conditioner";
    }
}
