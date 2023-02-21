package OO.OOPhone;

public class SIMCard {
    private int id;
    private String number;

    public SIMCard(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public void sim(){
        System.out.println("ID: " + this.id);
        System.out.println("Nummer: " + this.number);
    }

    public void doCall(int number){
        System.out.println(number + " ruft dich an!");
    }
}
