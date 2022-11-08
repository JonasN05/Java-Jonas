package OO.objects;

public class Tank {
    private int maxfuel;
    private int fuel;



    public Tank(int maxfuel, int fuel) {
        this.maxfuel = maxfuel;
        if (fuel>this.maxfuel){
            System.out.println("nicht möglich (fuel error)");
            this.fuel = 0;
        }else{
            this.fuel = fuel;
        }
    }




    public int getMaxfuel() {
        return maxfuel;
    }

    public void setMaxfuel(int maxfuel) {
        this.maxfuel = maxfuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        if (fuel>this.maxfuel){
            System.out.println("nicht möglich");
        }else{
            this.fuel = fuel;
        }


    }
}
