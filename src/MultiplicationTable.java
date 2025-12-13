import java.util.Scanner;

public class MultiplicationTable
{
Scanner sc = new Scanner(System.in);
long num;
public void multTable()
{
    System.out.println("Enter the number for which you require the multiplication table:");
    num=sc.nextInt();
   long product=0;

    for(int i=1;i<=100;i++)
    {
        product = num*i;

        System.out.print(num+" * ");
        System.out.print(i+"  ");
        System.out.println("= "+product);
    }
}

public static void main(String[] args) {
    MultiplicationTable mt = new MultiplicationTable();
    mt.multTable();
}
}

