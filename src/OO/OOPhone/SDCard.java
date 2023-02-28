package OO.OOPhone;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private double capacity;
    private double currentCapacity;
    private List<PhoneFile> phoneFiles;

    public SDCard(double capacity) {
        this.capacity = capacity;
        this.currentCapacity = 0;
        this.phoneFiles = new ArrayList<>();
    }

    public void getAllFiles(){
        for (PhoneFile phoneFile:phoneFiles) {
            System.out.println(phoneFile);
        }
    }
    public void getPhoneFileInfo(int file){
        phoneFiles.get(file).getInfo();
    }
    public void getFreeSpace(){
        double amount = capacity - currentCapacity;
        System.out.println(amount);
    }


    public void addPhoneFile(PhoneFile phoneFile){
        phoneFiles.add(phoneFile);
    }
    public double getCapacity() {
        return capacity;
    }
    public double getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(double size) {
        currentCapacity = currentCapacity + size;
    }
}
