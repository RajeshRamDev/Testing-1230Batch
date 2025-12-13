import java.util.Scanner;

public class LeapYearTernary {
    Scanner sc = new Scanner(System.in);
    int year;
    public void leapyearMethod()
    {
        String checker;
        System.out.println("Enter the year: ");
        year = sc.nextInt();
        checker = ((year%4)==0)?"Leap Year"
                : "Non Leap Year";
        System.out.println(year+" is a "+checker);
        sc.close();
    }

    public static void main(String[] args) {
        LeapYearTernary ly = new LeapYearTernary();
        ly.leapyearMethod();
    }
}


