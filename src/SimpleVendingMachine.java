import java.util.Scanner;

public class SimpleVendingMachine {
    Scanner sc = new Scanner(System.in);
    int choice;
    public void simpleVendingMethod()
    {
        System.out.println("Enter your choice for food 1,2 or 3: ");
        choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Chips");
                break;
            case 2:
                System.out.println("Soda");
                break;
            case 3:
                System.out.println("Candy");
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

    public static void main(String[] args) {
        SimpleVendingMachine sv = new SimpleVendingMachine();
        sv.simpleVendingMethod();
    }
}
