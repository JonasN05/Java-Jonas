package OO;

import OO.objects.Car;

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelconsumption = 7;
        c1.serialNumber = "A1234";
        c1.fuelamount = 70;
        c1.fuel = 70;

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelconsumption = 6;
        c2.serialNumber = "M1234";
        c2.fuelamount = 20;
        c2.fuel = 20;

        System.out.println(c2.fuelamount);
        c2.drive();
        c2.drive();
        System.out.println(c2.fuelamount);

        System.out.println();
        c2.breaking();

        System.out.println();
        c2.turboBoost();

        System.out.println();
        c2.honk(5);

        System.out.println();
        System.out.println(c2.getRemainingRange());
    }
}
