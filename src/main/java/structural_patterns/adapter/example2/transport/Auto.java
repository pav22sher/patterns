package structural_patterns.adapter.example2.transport;

public class Auto implements Transport{
    @Override
    public void drive() {
        System.out.println("Машина едет по дороге!");
    }
}
