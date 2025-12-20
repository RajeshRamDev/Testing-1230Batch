import java.util.Scanner;

public class CalculatorSwitch
{
Scanner sc = new Scanner(System.in);
    double a,b;
    public void calSwitch()
    { int choice;
        System.out.println("Enter your choice: 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division ");
        choice = sc.nextInt();
        System.out.println("Enter the number1: ");
        a = sc.nextDouble();
        System.out.println("Enter the number2: ");
        b = sc.nextDouble();
        switch (choice)
        { case 1:
            System.out.println("ADDITION");
           double sum = a+b;
            System.out.println("The addition of the two numbers is: "+sum);
            break;
            case 2:
                System.out.println("SUBTRACTION");
                double diff = a-b;
                System.out.println("The difference between the two numbers is: "+diff);
                break;
            case 3:
                System.out.println("MULTIPLICATION");
                double product = a*b;
                System.out.println("The product of two numbers is: "+product);
                break;
            case 4:
                System.out.println("DIVISION");
                double quotient =a/b;
                System.out.println("The quotient after division of a by b is: ");
                break;
        }


    }

    public static void main(String[] args) {
        CalculatorSwitch cs = new CalculatorSwitch();
        cs.calSwitch();
    }

}
