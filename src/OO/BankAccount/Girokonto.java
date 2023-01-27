package OO.BankAccount;

public class Girokonto extends BaseAccount{
    private double interest;
    private double dopsitionKreditkonto;

    public Girokonto(double bankbalance, double interest) {
        super(bankbalance);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setDopsitionKreditkonto(double dopsitionKreditkonto) {
        this.dopsitionKreditkonto = dopsitionKreditkonto;
    }
}
