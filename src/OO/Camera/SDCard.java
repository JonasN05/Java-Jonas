package OO.Camera;

import OO.OOPhone.PhoneFile;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<Picture> pictureFiles;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.pictureFiles = new ArrayList<>();
    }
}

