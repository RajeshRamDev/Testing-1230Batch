import java.util.Scanner;

public class TernaryOperators {
    Scanner sc = new Scanner(System.in);
    int a = 100;
    int b = 20;
    int c = 30;
    public void minNum()
    {
        int min;
        min= (a<b)?(a<c?a:c):(b<c?b:c);
        System.out.println("The Minimum among the numbers is: " +min);
    }
    public void oddEven(int a, int b)
    {
        this.a =a;
        this. b= b;
        int d = (a%2 == 0) ?((b%2==0)?a:b) :(b);
        System.out.println(" the odd number is "+d);
    }
    public void posneg()
    { int num;
        System.out.println("Enter number:");
        num = sc.nextInt();
        String check;
        check= (num>0)?"Positive":((num<0)?"Negative":"Zero");
        System.out.println(num+ " is " +check);
    }

    public static void main(String[] args) {
        TernaryOperators to = new TernaryOperators();
        to.minNum();
        to.oddEven(40,21);
        to.posneg();}
}
