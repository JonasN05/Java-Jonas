package OO.objects;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class Car {
    //Instanz, Gedächtnisvariabeln

    private Engine engine;
    private List<RearMirror> mirrors;
    private List<Tire> tires;
    private Tank tank;
    private int fuelconsumption;
    private String brand;
    private String serialNumber;
    private String color;


    public Car(Engine engine, int fuelconsumption, String brand, String serialNumber, String color, Tank tank){
        this.engine = engine;
        this.tank = tank;
        this.mirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
        this.fuelconsumption = fuelconsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }
    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void addTire(Tire tire){
        this.tires.add(tire);
    }
    public List<Tire> getTires() {
        return tires;
    }


    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tank getTank() {
        return tank;
    }
    public void setTank(Tank tank) {
        this.tank = tank;
    }




    public void setFuelconsumption(int fuelconsumption) {
        this.fuelconsumption = fuelconsumption;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getFuelconsumption() {
        return fuelconsumption;
    }
    public String getBrand() {
        return brand;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public String getColor() {
        return color;
    }

    public void drive(){
        //this variable is never used because of "this."
        int fuelconsumption = 100;

        System.out.println("das Auto fährt");
        //this.fuelamount = this.fuelamount - this.fuelconsumption;
        System.out.println(this.getEngine().getSpeed());
    }



    /*
    public void breaking(){
        System.out.println("Ich bremse");
    }

    public void turboBoost(){
        if (this.fuel*0.1<this.fuelamount){
            System.out.println("SuperBoostMode");
        }else{
            System.out.println("Not enough fuel to go to superboost");
        }
    }

    public void honk(int amountOfRepetitions){
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
        System.out.println("Ich bin ein " + this.brand + " und habe die Farbe "+ color +" und habe " + this.getEngine().getHorsePower() +"ps");
    }

    public int getRemainingRange(){
        return this.fuelamount/this.fuelconsumption;
    }
    */

}
