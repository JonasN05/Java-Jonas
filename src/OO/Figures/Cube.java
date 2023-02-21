package OO.Figures;

public class Cube extends Figure{
    public Cube(String name) {
        super(name);
    }

    public double getArea(double length, double width){
        return length * width * 6;
    }

}
