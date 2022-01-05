package structural_patterns.adapter.example2;

import structural_patterns.adapter.example2.transport.Transport;

public class Driver {
    public void travel(Transport transport)
    {
        transport.drive();
    }
}
