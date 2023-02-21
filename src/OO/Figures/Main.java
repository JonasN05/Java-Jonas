package OO.Figures;

public class Main {
    public static void main(String[] args) {
        Figure fi = new Figure("example");

        Circle ci = new Circle("c1");
        System.out.println(ci.getArea(2));
        System.out.println(ci.getName());

        Cube cu = new Cube("cu1");
        System.out.println(cu.getArea(2,3));

        Quad qu = new Quad("qu1");
        System.out.println(qu.getArea(2,3));

        Square sq = new Square("sq1");
        System.out.println(sq.getArea(2));
    }
}
