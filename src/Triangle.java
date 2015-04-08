/**
 * Created by IKZN on 07.04.2015.
 */
public class Triangle implements Shape{
    //стороны
    double a;
    double b;
    double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


   /* //углы
    int alpha;
    int beta;
    int gamma;*/


  /*  public Triangle(int a,int b,int c,int alpha,int beta,int gamma) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
    }*/

    public Triangle(double a,double b,double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double area() {
        double p=(a+b+c)/2.0;

        double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }

    @Override
    public String ToString() {
        return "\t" + " area triangle = " + this.area() + "; perimeter triangle = " + this.perimeter();
    }


    @Override
    public double perimeter() {
        return a+b+c;
    }

}
