package structural_patterns.facade.example1;

import structural_patterns.facade.example1.gps.GPSInterface;
import structural_patterns.facade.example1.gps.GPSNotifier;
import structural_patterns.facade.example1.gps.GPSPower;
import structural_patterns.facade.example1.gps.RoadAdvisor;

public class Main {
    public static void main(String[] args) {
        GPSPower power = new GPSPower();
        GPSNotifier notifier = new GPSNotifier();
        RoadAdvisor advisor = new RoadAdvisor();
        GPSInterface gps = new GPSInterface(power, notifier, advisor);
        gps.activate();
    }
}
