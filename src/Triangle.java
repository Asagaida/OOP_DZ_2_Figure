
public class Triangle extends Figure{
    public Triangle(){
        setSide(0);
        setHeight(0);

    }

    @Override
    void area() {
        double s = 0.5*getSide()*getHeight();
        System.out.println("Height: " + getHeight());
        System.out.println("Side: " + getSide());
        System.out.println("triangle area = " + s);
        System.out.println("=====================");
        return;

    }
}
