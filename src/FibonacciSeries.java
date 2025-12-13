import java.util.Scanner;

public class FibonacciSeries {
    Scanner sc = new Scanner(System.in);
    public void fibSeries()
    {
        int sum=0;
        System.out.println("Enter the range of numbers: ");
        int num;
        num = sc.nextInt();
        for(int i=0;i<=num;i++) {
            sum = sum + i;
            System.out.println(+sum);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FibonacciSeries fs=new FibonacciSeries();
        fs.fibSeries();
    }
}


