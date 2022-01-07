package behavioral_patterns.visitor.example1.shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fruit implements Product{
    private String name;
    private int pricePerKg;
    private int weight;

    @Override
    public int accept(ShopVisitor visitor) {
        return visitor.visit(this);
    }
}
