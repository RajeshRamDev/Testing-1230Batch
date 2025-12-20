import java.util.Scanner;

public class MenuDrivenProgram {
    Scanner sc = new Scanner(System.in);
    int menu;
    double a,b;
    public void menuChooser()
    {
        System.out.println("Enter your choice from 1 to 4: ");
        menu = sc.nextInt();
        System.out.println("Enter the number1: ");
        a= sc.nextDouble();
        System.out.println("Enter the number2: ");
        b= sc.nextDouble();

        switch (menu)
        {
            case 1 :
                System.out.println("You have chosen Addition");
               double c = a+b;
                System.out.println("Sum is: "+c);
                break;
            case 2 :
                System.out.println("You have chosen Subtraction");
                double d = a-b;
                System.out.println("Difference is: "+d);
                break;
            case 3 :
                System.out.println("You have chosen Multiplication");
                double e = a+b;
                System.out.println("Product is: "+e);
                break;
            case 4 :
                System.out.println("You have chosen Division");
                double f = a+b;
                System.out.println("Sum is: "+f);
                break;
            default:
                System.out.println("Enter choice between 1 to 4");

        }
    }

    public static void main(String[] args) {
        MenuDrivenProgram md = new MenuDrivenProgram();

        md.menuChooser();
    }
}
