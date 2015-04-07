public class Trapeze implements Shape {
    float a;
    float b;
    float c;
    float d;

    public Trapeze(float d, float c, float b, float a) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }


    @Override
    public double perimeter() {
        return a+b+c+d;
    }

    @Override
    public double area() {
        double p=(a+b+c+d)/2;
        double S=(a+b)*Math.sqrt((p-a)*(p-b)*(p-a-c)*(p-a-d))/(4*Math.abs(a-b));
        return S;
    }
}