package OORemote;

public class Battery {
    private double startBatteryLevel;
    private double currentBatteryLevel;

    public Battery(int startBatteryLevel) {
        this.startBatteryLevel = startBatteryLevel;
        this.currentBatteryLevel = this.startBatteryLevel;
    }

    public double getStartBatteryLevel() {
        return startBatteryLevel;
    }
    public double getCurrentBatteryLevel() {
        return currentBatteryLevel;
    }

    public void setCurrentBatteryLevel(double currentBatteryLevel) {
        this.currentBatteryLevel = currentBatteryLevel;
    }
}




