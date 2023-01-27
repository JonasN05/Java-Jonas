package OO.BankAccount;

public class Main {

    public static void main(String[] args) {
        BaseAccount ba = new BaseAccount(0);
        ba.deposit(1000);
        ba.disburse(2000);
        System.out.println(ba.getBankBalance());

        System.out.println();

        Sparbuch sp = new Sparbuch(0);
        sp.deposit(500);
        sp.disburse(600);
        System.out.println(sp.getBankBalance());

        System.out.println();

        Girokonto gk = new Girokonto(0, 1.5);
        gk.deposit(500);
        gk.disburse(600);
        System.out.println(gk.getBankBalance());
        System.out.println(gk.getInterest());

        System.out.println();

        Kreditkonto kk = new Kreditkonto(100);
        kk.deposit(100);
        kk.disburse(200);
        System.out.println(kk.getBankBalance());
    }
}
