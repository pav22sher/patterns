package structural_patterns.adapter.example2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import structural_patterns.adapter.example2.animal.Camel;
import structural_patterns.adapter.example2.transport.Transport;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CamelToTransportAdapter implements Transport {
    private Camel camel;

    @Override
    public void drive() {
        camel.move();
    }
}
