package OO.OOPhone;

public class Main {
    public static void main(String[] args) {


        SIMCard sim = new SIMCard(01, "04367761597411");
        SDCard sd = new SDCard(20);
        Camera ca = new Camera();

        Phone ph = new Phone("black", sd, sim, ca);


        ph.takePicture(Camera.resolution.HIGH,"png","landscape");
        ph.takePicture(Camera.resolution.LOW,"png","landscape2");
        ph.takePicture(Camera.resolution.MEDIUM,"png","landscape3");
        ph.takePicture(Camera.resolution.HIGH,"png","landscape4");
        ph.takePicture(Camera.resolution.HIGH,"png","landscape5");
        ph.printAllFiles();


        sim.sim();
        ph.makeCall(27542359);

        sd.getPhoneFileInfo(1);

        ph.getFreeSpace();


    }
}
