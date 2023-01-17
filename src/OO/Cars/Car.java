package OO.Cars;

public class Car {
    private String color;
    private int maxSpeed;
    private int basePrice;
    private int baseConsumtion;
    private Producer producer;
    private Engine engine;

    public Car(String color, int maxSpeed, int basePrice, int baseConsumtion, Producer producer, Engine engine){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumtion = baseConsumtion;
        this.producer = producer;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getBasePrice() {
        return basePrice;
    }
    public int getBaseConsumtion() {
        return baseConsumtion;
    }

    public Producer getProducer() {
        return producer;
    }
    public Engine getEngine() {
        return engine;
    }

    public double price(){
        double price = basePrice*producer.getDiscount();
        //System.out.println(price);
        return price;
    }
    public double fuelConsumtion(){
        double fuelconsumption;
        if (engine.getMileage()<=50000){
            fuelconsumption = baseConsumtion;
        }else{
            fuelconsumption = baseConsumtion * 1.098;
        }
        //System.out.println(fuelconsumption);
        return fuelconsumption;
    }

    public void carInfo(){
        System.out.println("----------------------------");
        System.out.println("Color: " + color);
        System.out.println("Maximalgeschwindigkeit: " + maxSpeed);
        System.out.println("Basispreis: " + basePrice);
        System.out.println("Basisverbrauch: " + baseConsumtion);
        System.out.println("Preis: " + price());
        System.out.println("Benzinverbrauch: " + fuelConsumtion());
    }
}
