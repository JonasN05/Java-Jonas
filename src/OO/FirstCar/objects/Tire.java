package OO.FirstCar.objects;

public class Tire {

    public enum TYPE{
        winterTire,
        summerTire
    }

    private int preassure;
    private int size;
    private TYPE type;

    public Tire(int preassure, int size, TYPE type) {
        this.preassure = preassure;
        this.size = size;
        this.type = type;
    }


    public int getPreassure() {
        return preassure;
    }
    public void setPreassure(int preassure) {
        this.preassure = preassure;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public TYPE getType() {
        return type;
    }
    public void setType(TYPE type) {
        this.type = type;
    }
}
