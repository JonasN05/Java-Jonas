package OORemote;

public class Battery {
    private int startBatteryLevel;
    private int currentBatteryLevel;

    public Battery(int startBatteryLevel) {
        this.startBatteryLevel = startBatteryLevel;
        this.currentBatteryLevel = startBatteryLevel;
    }

    public int getStartBatteryLevel() {
        return startBatteryLevel;
    }
    public int getCurrentBatteryLevel() {
        return currentBatteryLevel;
    }
}




