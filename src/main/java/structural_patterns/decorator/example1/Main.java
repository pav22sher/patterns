package structural_patterns.decorator.example1;

import structural_patterns.decorator.example1.car.AudiA5;
import structural_patterns.decorator.example1.car.Car;
import structural_patterns.decorator.example1.car.Conditioner;
import structural_patterns.decorator.example1.car.GPS;

public class Main {
    public static void main(String[] args) {
        Car car = new AudiA5();
        System.out.println(car.getInfo());
        System.out.println(car.getPrice());

        Car gps = new GPS(car);
        System.out.println(gps.getInfo());
        System.out.println(gps.getPrice());

        Car conditioner = new Conditioner(car);
        System.out.println(conditioner.getInfo());
        System.out.println(conditioner.getPrice());

        Car multiCar = new Conditioner(new GPS(new AudiA5()));
        System.out.println(multiCar.getInfo());
        System.out.println(multiCar.getPrice());
    }
}
