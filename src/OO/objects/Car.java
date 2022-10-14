package OO.objects;

public class Car {
    //Instanz, Gedächtnisvariabeln


    //dont do that later
    public int fuelconsumption;
    public String brand;
    public String serialNumber;
    public int fuelamount;
    public int fuel;
    private String color;


    public void drive(){
        //this variable is never used because of "this."
        int fuelconsumption = 100;

        System.out.println("das Auto fährt");
        this.fuelamount = this.fuelamount - this.fuelconsumption;
    }

    public void breaking(){
        System.out.println("Ich bremse");
    }

    public void turboBoost(){
        if (this.fuel*0.1<this.fuelamount){
            System.out.println("SuperBoostMode");
        }else{
            System.out.println("Not enough fuel to go to superboost");
        }
    }

    public void honk(int amountOfRepetitions){
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    public int getRemainingRange(){
        return this.fuelamount/this.fuelconsumption;
    }
}
