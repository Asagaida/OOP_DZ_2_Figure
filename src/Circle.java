public class Circle extends Figure{
    Circle(){
        setRadius(0);
    }

    @Override
    void area() {
        double s = getPi()*getRadius()*getRadius();

        System.out.println("площадь круга: Pi*r*r");
        System.out.println("Radius: " + getRadius());
        System.out.println("Pi: " + getPi());
        System.out.println("circle  area = " + s);
        System.out.println("=====================");
        return;
    }
}
