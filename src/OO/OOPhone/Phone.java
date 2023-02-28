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

    public void takePicture(Camera.resolution res, String extension, String name){
        double size;
        if (res == Camera.resolution.HIGH){
            size = 8;
        } else if (res == Camera.resolution.MEDIUM){
            size = 6;
        } else{
            size = 4;
        }
        if (sdCard.getCurrentCapacity()+size <= sdCard.getCapacity()){
            sdCard.addPhoneFile(camera.makePicture(res, extension, name, size));
            sdCard.setCurrentCapacity(size);
        }
    }


    public void makeCall(int number){
        simCard.doCall(number);
    }

    public void getFreeSpace(){
        sdCard.getFreeSpace();
    }

    public void printAllFiles(){
        sdCard.getAllFiles();
    }

}
