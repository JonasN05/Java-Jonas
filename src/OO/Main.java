package OO;

import OO.objects.Car;
import OO.objects.Engine;
import OO.objects.Tank;

public class Main {

    public static void main(String[] args) {

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL,99);
        Tank t1 = new Tank(200,100);

        Car c1 = new Car(e1, 10, "Audi", "A1234", "red", t1);

        int value  = c1.getEngine().getHorsePower();
        System.out.println(value);

        e1.setSpeed(70);
        c1.drive();

        System.out.println(c1.getTank().getMaxfuel());
        System.out.println(t1.getFuel());

        /*
        Car c1 = new Car(0,"","", 0,0,"");
        c1.setBrand("Audi");
        c1.setFuelconsumption(7);
        c1.setSerialNumber("A1234");
        c1.setFuelamount(70);
        c1.setFuel(120);

        System.out.println(c1.getFuel());
         */

        /*
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
        */

        /*
        Car c3 = new Car(0,"VW","", 0,0,"");
        System.out.println(c3.getBrand());

        */

    }
}
