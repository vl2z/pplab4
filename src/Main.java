public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Circle circle = new Circle(5);
        System.out.println(circle.area()+" - "+circle.perimeter());

        Rectangle rectangle = new Rectangle(3, 9);
        System.out.println(rectangle.area()+" - "+rectangle.perimeter());

        Parallelogram parallelogram = new Parallelogram(4, 9, 0, 3);
        System.out.println(parallelogram.area()+" - "+parallelogram.perimeter());

        Rhombus rhombus = new Rhombus(7, 30, 0);
        System.out.println(rhombus.area()+" - "+rhombus.perimeter());

        Trapeze trapeze = new Trapeze(3, 5, 2, 7);
        System.out.println(trapeze.area()+" - "+trapeze.perimeter());

        Triangle triangle = new Triangle(2, 3, 4);
        System.out.println(triangle.area()+" - "+triangle.perimeter());
    }
}
