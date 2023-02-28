package OO.OOPhone;

import OO.OORemote.Battery;

public class Camera {
    public enum resolution{
        HIGH,
        MEDIUM,
        LOW
    }
    private int idNumber;

    public Camera() {
        this.idNumber = 0;
    }

    public PhoneFile makePicture(resolution res, String extension, String name, double size){
        PhoneFile pf = new PhoneFile(idNumber, extension, size, name);
        idNumber ++;
        return pf;
    }
}
