public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Circle circle = new Circle(5);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(3, 9);
        System.out.println(rectangle.toString());

        Parallelogram parallelogram = new Parallelogram(4, 9, 0, 3);
        System.out.println(parallelogram.toString());

        Rhombus rhombus = new Rhombus(7, 30, 0);
        System.out.println(rhombus.toString());

        Trapeze trapeze = new Trapeze(3, 5, 2, 7);
        System.out.println(trapeze.toString());

        Triangle triangle = new Triangle(2, 3, 4);
        System.out.println(triangle.toString());
    }
}
