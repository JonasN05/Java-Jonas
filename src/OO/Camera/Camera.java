package OO.Camera;

public class Camera {
    public enum resolution{
        HIGH,
        MEDIUM,
        LOW
    }
    private int pixel;
    private int weight;
    private String color;
    private Producer producer;
    private SDCard sdCard;
    private Objective objective;

    public Camera(int pixel, int weight, String color, Producer producer, SDCard sdCard, Objective objective) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.producer = producer;
        this.sdCard = sdCard;
        this.objective = objective;
    }

    public void takePicture(String name, resolution res){
        int size;
        if (res == res.HIGH){
            size = 6;
        }else if (res == res.MEDIUM){
            size = 4;
        }else{
            size = 2;
        }

        Picture pi = new Picture(name);
    }
}
