import java.util.Scanner;

public class LCMCalculator {
    Scanner sc = new Scanner(System.in);
    int num1, num2;
    public static int gcd(int num1,int num2)
    {
        while (num2!=0)
        {
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        return num1;
    }
    public void lcmChecker()
    {
        int lcm=0;
        System.out.println("Enter the number1: ");
        num1=sc.nextInt();
        System.out.println("Enter the number2: ");
        num2=sc.nextInt();
        lcm=Math.abs(num1*num2)/gcd(num1,num2);
        System.out.println("The LCM of "+num1+" and "+num2+" is: "+lcm);
    }
    public static void main(String[] args) {
        LCMCalculator lc = new LCMCalculator();
        lc.lcmChecker();
    }
}
