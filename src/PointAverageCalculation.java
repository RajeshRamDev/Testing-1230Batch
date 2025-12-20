import java.util.Scanner;

public class PointAverageCalculation {
    Scanner sc = new Scanner(System.in);
    String grade;
    public void pointAverageMethod()
    {
        System.out.println("Enter your grade (A, B, C, D, E or F): ");
        grade = sc.next();
        switch (grade)
        {
            case "A":
                System.out.println("Grade Point: 4.0");
                break;
            case "B":
                System.out.println("Grade Point: 3.0");
                break;
                case "C":
                    System.out.println("Grade Point: 2.0");
            case "D":
                System.out.println("Grade Point: 3.0");
                break;
            case "E":
                System.out.println("Grade Point: 1.0");
                break;
            case "F":
                System.out.println("Grade Point: 0.0");
                break;
            default:
                System.out.println("Enter grade A, B, C, D, E or F");

        }

    }

    public static void main(String[] args) {
        PointAverageCalculation pa = new PointAverageCalculation();
        pa.pointAverageMethod();
    }
}
