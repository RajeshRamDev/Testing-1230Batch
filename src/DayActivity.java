import java.util.Scanner;

public class DayActivity {
    Scanner sc = new Scanner(System.in);
    int day;
    public void dayActMethod()
    {
        System.out.println("Enter the day from 1 to 7: ");
        day = sc.nextInt();
        switch (day)
        {case 1:
            System.out.println("Monday - Meeting at 10 am");
            break;
            case 2:
                System.out.println("Tuesday - Business call at 3 pm");
                break;
            case 3:
                System.out.println("Wednesday - Lunch at 2 pm");
                break;
            case 4:
                System.out.println("Thursday - Flight at 7 pm");
            break;
            case 5:
                System.out.println("Friday - Meeting at 11 am");
                break;
            case 6:
                System.out.println("Saturday - Movie at 9 pm");
                break;
            case 7:
                System.out.println("Sunday - Return Flight at 5 pm");
                break;
            default:
                System.out.println("Invalid Input");

        }
    }

    public static void main(String[] args) {
        DayActivity da = new DayActivity();
        da.dayActMethod();
    }

}
