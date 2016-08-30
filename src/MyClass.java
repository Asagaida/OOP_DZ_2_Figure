
public class MyClass {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();


        rectangle.setWidth(3);
        rectangle.setHeight(4);
        rectangle.area();

        triangle.setHeight(4);
        triangle.setSide(3);
        triangle.area();

        circle.setRadius(5);
        circle.area();
    }
}
