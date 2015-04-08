/**
 * Created by IKZN on 07.04.2015.
 */
public class Circle implements Shape{
    double r;


    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }

    @Override
    public String ToString() {
        return "\t" + "area circle = " + this.area() + " ; perimeter circle = " + this.perimeter();
    }
}
