package OO.FirstCar;

import OO.FirstCar.objects.*;

public class Main {

    public static void main(String[] args) {

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL,99);
        Tank t1 = new Tank(200,100);

        RearMirror r1 = new RearMirror(100,0);
        RearMirror r2 = new RearMirror(90,-40);

        Tire ti1 = new Tire(200,150, Tire.TYPE.summerTire);
        Tire ti2 = new Tire(190,150, Tire.TYPE.summerTire);
        Tire ti3 = new Tire(210,150, Tire.TYPE.summerTire);
        Tire ti4 = new Tire(180,150, Tire.TYPE.summerTire);
        Tire ti5 = new Tire(150,170, Tire.TYPE.winterTire);

        Car c1 = new Car(e1, 10, "Audi", "A1234", "red", t1);
        c1.addMirror(r1);
        c1.addMirror(r2);

        c1.addTire(ti1);
        c1.addTire(ti2);
        c1.addTire(ti3);
        c1.addTire(ti4);


        System.out.println(c1.getTires().get(0).getType());

        c1.getTires().get(0).setType(Tire.TYPE.winterTire);
        c1.getTires().get(0).setSize(20);
        System.out.println(c1.getTires().get(0).getType());
        System.out.println(c1.getTires().get(0).getSize());

        System.out.println(c1.getMirrors().get(0).getPosition());

        int value  = c1.getEngine().getHorsePower();
        System.out.println(value);

        e1.setSpeed(70);
        c1.drive();

        System.out.println(c1.getTank().getMaxfuel());

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
