package OO.Figures;

public class Quad extends Figure{
    public Quad(String name) {
        super(name);
    }

    public double getArea(double length, double width){
        return length * width;
    }
}
