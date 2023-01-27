package OO.BankAccount;

public class Kreditkonto extends BaseAccount{

    public Kreditkonto(double bankbalance) {
        super(bankbalance);
        if(bankbalance>0){
            System.out.println("Kreditkonto kann nicht positiv sein");
            this.bankBalance = 0;
        }
    }

    @Override
    public void deposit(double deposition) {
        System.out.println("Kein einzahlen auf das Kreditkonto möglich!");
    }
}
