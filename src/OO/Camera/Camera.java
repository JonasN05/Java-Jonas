package OO.Camera;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private List<SDCard> sdCards;
    private Objective objective;

    public Camera(int pixel, int weight, String color, Producer producer, Objective objective) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.producer = producer;
        this.objective = objective;
        this.sdCards = new ArrayList<>();
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

        String date = printSimpleDateFormat();
        Picture pi = new Picture(name, date, size);

        for (int i = 0; i < sdCards.size(); i++) {
            if (sdCards.get(i).getFreeCapacity()>=size){
                if (sdCards.get(i).getFreeCapacity()-10<=0 && sdCards.get(i).getFreeCapacity()-size!=0){
                    System.out.println("Achtung der Speicherplatz der SD-Karte" + i + " wird knapp");
                }
                sdCards.get(i).addPicture(pi);
                sdCards.get(i).setFreeCapacity(sdCards.get(i).getFreeCapacity() - size);
                System.out.println("Bild auf SD" + i + " gespeichert");
                if (sdCards.get(i).getFreeCapacity()==0){
                    System.out.println("Achtung der Speicherplatz der SD-Karte" + i + " ist leer");
                }
                break;
            }
        }
    }

    public void printPictureInfo(){
        for (SDCard SdCard: sdCards) {
            SdCard.getInfo();
        }
    }

    public String printSimpleDateFormat() {
        SimpleDateFormat formatter = new SimpleDateFormat(
                "yyyy.MM.dd - HH:mm:ss ");
        Date currentTime = new Date();
        return formatter.format(currentTime);
    }

    public void addSDCards(SDCard sdCard){
        sdCards.add(sdCard);
    }
}
