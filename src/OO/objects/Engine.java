package OO.objects;

public class Engine {
    public enum TYPE {
        DIESEL,
        GAS
    }
    private int horsePower;
    private TYPE type;
    private int speed;

    public Engine(int horsePower, TYPE type, int speed){
        this.horsePower = horsePower;
        this.type = type;
        if (speed<100&&speed>0){
            this.speed = speed;
        }else{
            System.out.println("Falscher Wert");
            this.speed = 50;
        }
    }

    public void drive(int amount){
        System.out.println("The motor is runnig with " + amount);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public int getSpeed() {return speed;}

    public void setSpeed(int speed) {
        if (speed<100&&speed>0){
            this.speed = speed;
        }else{
            System.out.println("Falscher Wert");
            this.speed = 50;
        }

    }
}
