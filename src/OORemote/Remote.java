package OORemote;

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

    public int getStatus(){
        double value1 = this.getBatteries(0).getCurrentBatteryLevel();
        this.getBatteries(1).getCurrentBatteryLevel();
    }

}
