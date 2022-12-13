package at.jonasnigg.examples.cars;

public class Producer {
    private String name;
    private String country;
    private double discount;

    public Producer(String name, String country, double discount){
        this.name = name;
        this.country = country;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public double getDiscount() {
        return discount;
    }
}
