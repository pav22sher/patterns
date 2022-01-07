package behavioral_patterns.visitor.example1.shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Product{
    private String name;
    private int price;

    @Override
    public int accept(ShopVisitor visitor) {
        return visitor.visit(this);
    }
}
