import java.util.Scanner;

public class SumofEven {
    Scanner sc = new Scanner(System.in);
    int N;
    public void sumEven()
    {
        int sum = 0;
        System.out.println("Enter the number up to which the sum of even numbers has to be found: ");
        N= sc.nextInt();
        for(int i =0;i<=N;i++)
        {
            sum=sum+i;
            i++;

        } System.out.println("The sum of even numbers till "+N+" is: "+sum);
        System.out.println();
    }

    public static void main(String[] args) {
        SumofEven se = new SumofEven();
        se.sumEven();
    }
}


