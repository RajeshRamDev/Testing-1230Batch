import java.util.Scanner;

public class MinofThree {
    Scanner sc = new Scanner(System.in);
    int num1; int num2; int num3;
    public void minThree()
    {
        int min=0;
        System.out.println("Enter the number1: ");
        num1= sc.nextInt();
        System.out.println("Enter the number2: ");
        num2= sc.nextInt();
        System.out.println("Enter the number3: ");
        num3= sc.nextInt();
        min=(num1<num2)?((num1<num3)?num1:num3):((num2<num3)?num2:num3);
        System.out.println(min+" is the minimum number");
        sc.close();
    }

    public static void main(String[] args) {
        MinofThree mt = new MinofThree();
        mt.minThree();
    }
}
