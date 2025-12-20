public class Sqaure extends ShapeAbs{
    @Override
    public void calculateArea(double num) {
        double area = num*num;
        System.out.println("Area of the Square with side "+num+" centi meters is = "+area+" square centi meters");

    }
    public static void main(String[] args) {
       Sqaure sq = new Sqaure();
        sq.calculateArea(56.47);
    }
}

