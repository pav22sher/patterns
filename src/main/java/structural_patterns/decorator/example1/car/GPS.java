package structural_patterns.decorator.example1.car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GPS extends Decorator{
    private Car car;
    @Override
    public int getPrice() {
        return car.getPrice() + 1500;
    }
    @Override
    public String getInfo() {
        return car.getInfo() + " + GPS";
    }
}
