public class Parallelogram implements Shape {
    float a; //���������
    float b;
    float h;
    float alpha; //���� ��� ���������

    public Parallelogram(float a, float b, float alpha, float h) {
        this.a = a;
        this.b = b;
        this.alpha = alpha;
        this.h=h;
    }

    @Override
    public double perimeter() {
        return (a+b)*2;
    }

    @Override
    public double area() {
        if(alpha!=0)
            return a*b*Math.sin(alpha);
        else return a*h;
    }

    @Override
    public String ToString() {
        return super.toString() + "\t" + "area parallelogramm=" + this.area() + "perimeter parallelogramm=" + this.perimeter();
    }
}
