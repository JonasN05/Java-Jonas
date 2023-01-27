package OO.BankAccount;

public class Sparbuch extends BaseAccount{

    public Sparbuch(double bankbalance) {
        super(bankbalance);
    }

    @Override
    public void disburse(double disbursing) {
        if(this.bankBalance - disbursing < 0){
            System.out.println("Sie haben zu wenig Geld auf dem Sparbuch");
        }else{
            this.bankBalance -= disbursing;
        }

    }
}
