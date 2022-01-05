package structural_patterns.adapter.example2;

import structural_patterns.adapter.example2.animal.Camel;
import structural_patterns.adapter.example2.transport.Auto;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Auto auto = new Auto();
        driver.travel(auto);
        Camel camel = new Camel();
        CamelToTransportAdapter adapter = new CamelToTransportAdapter(camel);
        driver.travel(adapter);
    }
}
