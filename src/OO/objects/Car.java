package OO.objects;

public class Car {
    //Instanz, Gedächtnisvariabeln

    private Engine engine;
    private int fuelconsumption;
    private String brand;
    private String serialNumber;
    private int fuelamount;
    private int fuel;
    private String color;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
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

    public void setFuelamount(int fuelamount) {
        this.fuelamount = fuelamount;
    }

    public void setFuel(int fuel) {
        if(fuel>100){
            this.fuel = 100;
        }else{
            this.fuel = fuel;
        }
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

    public int getFuelamount() {
        return fuelamount;
    }

    public int getFuel() {
        return fuel;
    }

    public String getColor() {
        return color;
    }

    public Car(Engine engine, int fuelconsumption, String brand, String serialNumber, int fuelamount, int fuel, String color){
        this.engine = engine;
        this.fuelconsumption = fuelconsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;

    }

    public void drive(){
        //this variable is never used because of "this."
        int fuelconsumption = 100;

        System.out.println("das Auto fährt");
        this.fuelamount = this.fuelamount - this.fuelconsumption;
    }

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
}
