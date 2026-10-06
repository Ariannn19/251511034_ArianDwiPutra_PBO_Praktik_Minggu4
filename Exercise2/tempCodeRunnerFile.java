public class TestShape {
    public static void main(String[] args) {
        //Superclass Shape
        System.out.println("=== TEST SHAPE ===");
        Shape s1 = new Shape();
        System.out.println(s1);
        Shape s2 = new Shape("blue", false);
        System.out.println(s2);
        System.out.println();

        //Subclass Circle
        System.out.println("=== TEST CIRCLE ===");
        Circle c1 = new Circle(3.5, "yellow", true);
        System.out.println(c1);
        System.out.println("Area      : " + c1.getArea());
        System.out.println("Perimeter : " + c1.getPerimeter());
        System.out.println();

        //Subclass Rectangle
        System.out.println("=== TEST RECTANGLE ===");
        Rectangle r1 = new Rectangle(4.0, 6.0, "orange", false);
        System.out.println(r1);
        System.out.println("Area      : " + r1.getArea());
        System.out.println("Perimeter : " + r1.getPerimeter());
        System.out.println();

        // Subclass Square
        System.out.println("=== TEST SQUARE ===");
        Square sq1 = new Square(5.0, "purple", true);
        System.out.println(sq1);
        System.out.println("Area      : " + sq1.getArea());
        System.out.println("Perimeter : " + sq1.getPerimeter());
    }
}