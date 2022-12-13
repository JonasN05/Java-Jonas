package at.jonasnigg.examples.cars;

public class Main {

    public static void main(String[] args) {
        Engine e1 = new Engine(Engine.TYPE.GAS, 240,52000);
        Producer p1 = new Producer("VW", "Deutschland", 0.98);
        Car c1 = new Car("Black", 250,25000,10, p1, e1);

        c1.carInfo();

        Car c2 = new Car("Grey", 200, 45000, 6,p1,e1);
        c2.carInfo();
    }
}