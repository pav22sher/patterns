package generating_patterns.builder.example1;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Complex {
    public double re;
    public double im;
}
