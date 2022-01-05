package structural_patterns.bridge.example2;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        Remote remoteTv = new Remote(tv);
        remoteTv.power();
        tv.printStatus();

        Radio radio = new Radio();
        Remote remoteRadio = new Remote(radio);
        remoteRadio.power();
        radio.printStatus();
    }
}
