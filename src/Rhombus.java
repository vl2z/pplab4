public class Rhombus implements Shape {
    float a;
    float h;
    float alpha;

    public Rhombus(float a, float alpha, float h) {
        this.a = a;
        this.alpha = alpha;
        this.h=h;
    }

    @Override
    public double perimeter() {
        return a*4;
    }

    @Override
    public double area() {
        if(alpha!=0) {
            alpha=(float)Math.toRadians(alpha);
            return a*a*Math.sin(alpha);
        }
        else return a*h;
    }

    @Override
    public String ToString() {
        return  "\t" + " area rhombus= " + this.area() + " perimeter rhombus= " + this.perimeter();
    }
}
