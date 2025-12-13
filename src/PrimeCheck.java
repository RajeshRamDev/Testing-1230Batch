import java.util.Scanner;

public class PrimeCheck {
    Scanner sc = new Scanner(System.in);
    int N;
    public void primeCheckerMethod()
    {
        System.out.println("Enter the number:");
        N = sc.nextInt();
        System.out.println("The prime numbers up to "+N+" are: ");
        if(N>2)
        {
            for (int i =2;i<=N;i++) {
                boolean isPrime = true;
                for(int j=2; j*j<=i;j++)
                {
                    if(i%j==0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime)
                {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Enter the value of N greater than 2");
        }
    }

    public static void main(String[] args) {
        PrimeCheck pc = new PrimeCheck();
        pc.primeCheckerMethod();
    }
}
