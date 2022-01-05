package structural_patterns.facade.example1.gps;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GPSInterface {
    private GPSPower power;
    private GPSNotifier notifier;
    private RoadAdvisor advisor;
    public void activate(){
        power.powerOn();
        notifier.downloadRoadInfo();
        advisor.route();
    }
}
