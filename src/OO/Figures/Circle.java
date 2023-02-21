package OO.Figures;

public class Circle extends Figure{
    public Circle(String name) {
        super(name);
    }

    public double getArea(double radius){
        return radius * 2 * Math.PI;
    }
}
