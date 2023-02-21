package OO.Figures;

public class Square extends Figure{
    public Square(String name) {
        super(name);
    }

    public double getArea(double site){
        return site * site;
    }
}
