/**
 * Created by IKZN on 07.04.2015.
 */
public class Triangle implements Shape{
    //стороны
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    int b;
    int c;
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

    public Triangle(int a,int b,int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double area() {
        double p=(a+b+c)/2;
        double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }

    @Override
    public String ToString() {
        return super.toString() + "\t" + "area triangle=" + this.area() + "perimeter triangle=" + this.perimeter();
    }


    @Override
    public double perimeter() {
        return a+b+c;
    }

}
