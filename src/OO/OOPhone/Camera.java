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

    public void makePicture(resolution res, String extension, String name){
        PhoneFile pf = new PhoneFile(idNumber, extension, res, name);
        idNumber ++;
        SDCard.addPhoneFile(pf);
    }
}
