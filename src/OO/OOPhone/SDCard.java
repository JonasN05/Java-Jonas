package OO.OOPhone;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private double capacity;
    private static List<PhoneFile> phoneFiles;

    public SDCard(double capacity) {
        this.capacity = capacity;
        this.phoneFiles = new ArrayList<>();
    }

    public static void addPhoneFile(PhoneFile phoneFile){
        phoneFiles.add(phoneFile);
    }
}
