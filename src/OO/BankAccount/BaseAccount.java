package OO.BankAccount;

public class BaseAccount {
    protected double bankBalance;

    public BaseAccount(double bankbalance) {
        this.bankBalance = bankbalance;
    }

    public void deposit(double deposition){
        this.bankBalance += deposition;
    }
    public void disburse(double disbursing){
        this.bankBalance -= disbursing;
    }

    public double getBankBalance() {
        return bankBalance;
    }
}
