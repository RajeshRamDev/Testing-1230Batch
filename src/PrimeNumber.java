import java.util.Scanner;

public class PrimeNumber {
    Scanner sc = new Scanner(System.in);
    int num;
    int N;
    public void primNum()
    {
        System.out.println("Enter the number:");
        num=sc.nextInt();
        if(num>=2)
        {
            for(int i=2;i<num;i++)
            {
                if(num%i!=0)
                {
                    System.out.print("Prime Numbers");
                    break;
                }
                else {
                    System.out.print("Composite Number");
                    break;
                }
            }
            System.out.println();
            System.out.println();
        }
        else {
            System.out.println("Enter number greater than 2");
        }
    }
    public void primeNumlist()
    {
        System.out.println("Enter the value of N:");
        N=sc.nextInt();
        System.out.println("The prime numbers till "+N+" are: ");
        for(int i=2; i<N; i++)
        {
            if((N%i!=0))
            {
            System.out.println(i);
             }

        }

        System.out.println();
    }
    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
        pn.primNum();
        pn.primeNumlist();

    }
}


