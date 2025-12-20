public class Calculator {

    public int add(int a, int b)
    {
       return a+b;
    }
    public int add(int a,int b, int c)
    {

       return a+b+c;
    }
    public double add(double a, double b)
    {
       return  a+b;
    }

    public static void main(String[] args) {
        Calculator cr = new Calculator();
       int  sum1 =cr.add(5, 6);
        System.out.println("Sum of two integers: "+sum1);
       int sum2 = cr.add(7, 8, 9);
        System.out.println("Sum of three integers: "+sum2);
       double sum = cr.add(85.25, 92.17);
        System.out.println("Sum of two doubles: "+sum);

    }
}
