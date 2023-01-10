package oolamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<LightElement> lightElements;

    public Lamp() {
        this.lightElements = new ArrayList<>();
    }

    public void turnOn(int numberOfLightElement){
        boolean value = this.lightElements.get(numberOfLightElement).isStatus();
        if (value){
            System.out.println("Mein name ist " + this.lightElements.get(numberOfLightElement).getName() + ". Ich bin bereits eingeschaltet!");
        }else{
            int consumtion = this.lightElements.get(numberOfLightElement).getConsumption();
            this.lightElements.get(numberOfLightElement).setConsumption(consumtion + 5);
            this.lightElements.get(numberOfLightElement).setStatus(true);
        }
    }

    public void turnAllOn(){
        for (int i = 0; i < lightElements.size(); i++) {
            turnOn(i);
            System.out.println(this.lightElements.get(i).isStatus());
        }
    }

    public double getOverallPowerStatus(){
        double overallConsumption = 0;
        for (int i = 0; i < lightElements.size(); i++) {
            overallConsumption += this.lightElements.get(i).getConsumption();
        }
        return overallConsumption;
    }

    public void printNamesOfLightElements(){
        for (int i = 0; i < lightElements.size(); i++) {
            System.out.println(this.lightElements.get(i).getName());
        }
    }

    public void addLightElement(LightElement lightElement){
        this.lightElements.add(lightElement);
    }
    public List<LightElement> getLightElements() {
        return lightElements;
    }
}
