package OO.OOLamp;

public class LightElement {

    private String name;
    private String color;
    private int consumption;
    private boolean status;

    public LightElement(String name, String color, int consumption, boolean status) {
        this.name = name;
        this.color = color;
        this.consumption = consumption;
        this.status = status;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public int getConsumption() {
        return consumption;
    }
    public boolean isStatus() {
        return status;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
