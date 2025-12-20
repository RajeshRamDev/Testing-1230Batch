public class Circleabs extends ShapeAbs
{
    @Override
    public void calculateArea(double num)
    {
        double area = 3.14* num*num;
        System.out.println("Area of the Circle with radius "+num+" centi meters is = "+area+" square centi meters");
    }

    public static void main(String[] args) {
        Circleabs ca = new Circleabs();
        ca.calculateArea(56.47);
    }
}
