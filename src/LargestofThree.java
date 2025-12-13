import java.util.Scanner;

public class LargestofThree {
    Scanner sc = new Scanner(System.in);
    int a; int b; int c;
    public void largeNum()
    {
        System.out.println("Enter any three numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+" Is the greatest number");
        } else if (b>c) {
            System.out.println(b+" Is the greatest number");

        }else
        {
            System.out.println(c+" Is the greatest number");
        }
    }

    public static void main(String[] args) {
        LargestofThree lt = new LargestofThree();
        lt.largeNum();
    }
}


