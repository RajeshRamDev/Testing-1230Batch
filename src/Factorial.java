import java.util.Scanner;

public class Factorial {

    Scanner sc = new Scanner(System.in);
    public void factNum()
    {
        System.out.println("Enter the number for which you need to find the factorial:");
        long num;
        num = sc.nextInt();
        long f=1;
        if (num > 0)
        {
            for (int i = 1; i <= num; i++)
            {
                f = f * i;
            }
            System.out.println("The factorial of the number is:"+f);
        }
        else
        {
            System.out.println("Invalid number");
        }
    }

    public static void main(String[] args)
    {
        Factorial ff= new Factorial();
        ff.factNum();
    }
}

