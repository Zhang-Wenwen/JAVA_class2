public class Square extends Shape{

    private double a;

    public Square(double a){
        this.a = a;
    }

    @Override
    public double Perimeter() {
        return a*4;
    }

    @Override
    public double Area() {
        return a*a;
    }
}