package at.jonasnigg.examples.cars;

public class Engine {
    public enum TYPE{
        DIESEL,
        GAS
    }
    private TYPE type;
    private int power;
    private int mileage;

    public Engine(TYPE type, int power, int mileage){
        this.type = type;
        this.power = power;
        this.mileage = mileage;
    }

    public TYPE getType() {
        return type;
    }
    public int getPower() {
        return power;
    }
    public int getMileage() {
        return mileage;
    }
}
