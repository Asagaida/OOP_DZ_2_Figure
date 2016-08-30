
public class Rectangle extends Figure{
    Rectangle(){
        setHeight(0);
        setWidth(0);


    }

    @Override
    void area() {
        double s = getHeight()*getWidth();
        System.out.println("Height: " + getHeight());
        System.out.println("Width: " + getWidth());
        System.out.println("rectangle area = "+s);
        System.out.println("=====================");
        return;

    }
}
