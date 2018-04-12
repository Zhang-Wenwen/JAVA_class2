import java.util.Scanner;

public class main {
    public  static void test(){
        System.out.println("请输入图形名称：circle,square.rectangle,Triangle");
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.next();
        switch (shape) {
            case "circle": {
                System.out.println("请输入圆的半径");
                Scanner radius = new Scanner(System.in);
                double r = radius.nextDouble();
                Circle circle = new Circle(r);
                double area = circle.Area();
                double perimeter = circle.Perimeter();
                prt(area, perimeter);
                break;
            }
            case "square": {
                System.out.println("请输入正方形边长a");
                Scanner length = new Scanner(System.in);
                double l = length.nextDouble();
                Square square = new Square(l);
                double area = square.Area();
                double pre = square.Perimeter();
                prt(area, pre);
                break;
            }
            case "rectangle": {
                System.out.println("请输入长方形长和宽");
                Scanner length = new Scanner(System.in);
                Scanner width = new Scanner(System.in);
                double l = length.nextDouble();
                double w = width.nextDouble();
                Rectangle rectangle = new Rectangle(l,w);
                double area = rectangle.Area();
                double per = rectangle.Perimeter();
                prt(area,per);
                break;
            }
            case "Triangle":{
                System.out.println("请输入三边长");
//                Scanner
            }
        }
    }
    private static void prt(double area, double perimeter){
        System.out.println("面积为"+area);
        System.out.println("周长为"+perimeter);
    }
}