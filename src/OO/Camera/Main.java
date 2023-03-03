package OO.Camera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Producer pd = new Producer("Sony", "USA");
        Objective ob = new Objective(pd, 20);

        Camera ca = new Camera(1080, 3, "black", pd,ob);

        SDCard sd1 = new SDCard(10);
        SDCard sd2 = new SDCard(7);
        ca.addSDCards(sd1);
        ca.addSDCards(sd2);

        ca.takePicture("landscape", Camera.resolution.HIGH);
        ca.takePicture("landscape1", Camera.resolution.HIGH);
        ca.takePicture("landscape2", Camera.resolution.MEDIUM);

        sd1.printPictures();
        sd2.printPictures();

    }
}
