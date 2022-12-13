package oolamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<LightElement> lightElements;

    public Lamp() {
        this.lightElements = new ArrayList<>();
    }

    public void addLightElement(LightElement lightElement){
        this.lightElements.add(lightElement);
    }

    public List<LightElement> getLightElements() {
        return lightElements;
    }
}
