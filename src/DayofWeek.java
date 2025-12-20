import java.util.Scanner;

public class DayofWeek {
    Scanner sc = new Scanner(System.in);
    int choice;
    public void dayChecker()
    {
        System.out.println("Enter the choice: 1 for Monday,2 for Tuesday,3 for Wednesday,4 for Thursday,5 for Friday,6 for Saturday,7 for Sunday");
       choice = sc.nextInt();
       switch(choice)
       {
           case 1:
               System.out.println("Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           case 6:
               System.out.println("Saturday");
               break;
           case 7:
               System.out.println("Sunday");
               break;

       }
    }

    public static void main(String[] args) {
        DayofWeek dw = new DayofWeek();
        dw.dayChecker();
    }
}
