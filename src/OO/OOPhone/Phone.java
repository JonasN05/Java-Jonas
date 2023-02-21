package OO.OOPhone;

public class Phone {
    private String color;
    private SDCard sdCard;
    private SIMCard simCard;
    private Camera camera;

    public Phone(String color, SDCard sdCard, SIMCard simCard, Camera camera) {
        this.color = color;
        this.sdCard = sdCard;
        this.simCard = simCard;
        this.camera = camera;
    }
}
