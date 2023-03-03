package OO.Camera;

import OO.OOPhone.PhoneFile;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int freeCapacity;
    private List<Picture> pictureFiles;

    public SDCard(int capacity) {
        this.freeCapacity = capacity;
        this.pictureFiles = new ArrayList<>();
    }

    public void addPicture(Picture picture){
        pictureFiles.add(picture);
    }

    public int getFreeCapacity() {
        return freeCapacity;
    }
    public void setFreeCapacity(int freeCapacity) {
        this.freeCapacity = freeCapacity;
    }

    public void printPictures(){
        for (Picture picture:pictureFiles) {
            System.out.println(picture.getName());

        }
    }
}

