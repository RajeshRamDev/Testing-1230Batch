import java.util.Scanner;

public class SumNatural {
    Scanner sc = new Scanner(System.in);
    int sum=0;
    public void sumNat()
    {

        System.out.println("Enter the total Number for which you need to find the sum:");
        int n=sc.nextInt();

        for( int i=1;i<=n;i++)
        {
            sum=sum+i;

        }  System.out.println("The sum is: "+sum);
    }

    public static void main(String[] args) {
        SumNatural sn= new SumNatural();
        sn.sumNat();
    }
}


