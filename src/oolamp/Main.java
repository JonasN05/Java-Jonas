package oolamp;

public class Main {

    public static void main(String[] args) {
        Lamp l1 = new Lamp();

        LightElement le1 = new LightElement("le1", "red", 10, true);
        l1.addLightElement(le1);
        LightElement le2 = new LightElement("le2", "green", 20, true);
        l1.addLightElement(le2);
        LightElement le3 = new LightElement("le3", "blue", 30, false);
        l1.addLightElement(le3);


        l1.turnOn(0);
        l1.turnOn(2);

        l1.turnAllOn();

        System.out.println(l1.getOverallPowerStatus());
        l1.printNamesOfLightElements();
    }
}