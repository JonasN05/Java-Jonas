package OO.Calculator;

public class Main {
    public static void main(String[] args) {

        BaseCalculator bc = new BaseCalculator();
        SinusCalculator sc = new SinusCalculator();
        RootCalculator rc = new RootCalculator();

        System.out.println(bc.plus(4,7));

        System.out.println(sc.sinus(240));
        System.out.println(sc.minus(2,8));

        System.out.println(rc.root(16));
        System.out.println( rc.multiply(3,4));

    }
}
