public class Trangle extends Shape{
    private double a;
    private double b;
    private double c;

    public  Trangle(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double Perimeter() {
        return a + b + c;
    }

    @Override
    public double Area() {
        double s = (a + b + c) / 2;
        double area = Math.pow(s*(s-a)*(s-b)*(s-c),0.5);
        return area;
    }
}
