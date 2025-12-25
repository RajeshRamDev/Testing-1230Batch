import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the number 1: ");
            double num1 = sc.nextInt();
            System.out.println("Enter the operator: +,-,*,/");
            char op = sc.next().charAt(0);
            System.out.println("Enter the number 2: ");
            double num2 = sc.nextInt();
            if(op=='+')
            {
                System.out.println("Sum: "+(num1+num2));
            } else if (op=='-') {
                System.out.println("Difference: "+(num1-num2));
            } else if (op=='*') {
                System.out.println("Product "+(num1*num2));
            } else if (op=='/') {
                if(num2==0)
                {
                    throw new ArithmeticException("Division by ZERO NOT POSSIBLE");
                }
                System.out.println("Quotient: "+(num1/num2));

            } else {
                System.out.println("Invalid Operator");
            }
        } catch (Exception e) {
            if(e instanceof java.util.InputMismatchException)
            {
                System.out.println("Enter numbers only");
            }
            else {
            System.out.println(e.getMessage()); }

        }

    }

    }

