package OO.OORemote;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private List<Battery> batteries;

    public Remote(/*List<Battery> batteries*/) {
        this.batteries = new ArrayList<>();
    }

    public List<Battery> getBatteries() {
        return batteries;
    }
    public void addBatteries(Battery battery){
        this.batteries.add(battery);
    }

    public double getStatus(){
        double value1 = getBatteries().get(0).getCurrentBatteryLevel();
        double value2 = getBatteries().get(1).getCurrentBatteryLevel();

        double result = (value1+value2)/2;
        System.out.println(result);
        return result;
    }

    public void turnOn(){
        System.out.println("Verbraucher angeschlossen");
        double battery1LevelChange = getBatteries().get(0).getCurrentBatteryLevel()*0.95;
        getBatteries().get(0).setCurrentBatteryLevel(battery1LevelChange);

        double battery2LevelChange = getBatteries().get(1).getCurrentBatteryLevel()*0.95;
        getBatteries().get(1).setCurrentBatteryLevel(battery2LevelChange);
    }
    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }





}
