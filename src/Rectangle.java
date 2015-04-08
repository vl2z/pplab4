/**
 * Created by IKZN on 07.04.2015.
 */
public class Rectangle implements Shape{
    int a;
    int b;

    public Rectangle(int a,int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimeter() {

        return (a+b)*2;
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public String ToString() {
        return super.toString() + "\t" + "area rectangle=" + this.area() + "perimeter rectangle=" + this.perimeter();
    }
}
