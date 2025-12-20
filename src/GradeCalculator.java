import java.util.Scanner;

public class GradeCalculator {
    Scanner sc = new Scanner(System.in);
    int score;
    public void gradeChecker() {
        System.out.println("Enter the score between 0 to 10: ");
        score = sc.nextInt();
        switch (score) {
            case 10:
            case 9:
                System.out.println("Grade S");
                break;
            case 8:
            case 7:
                System.out.println("Grade A");
                break;
            case 6:
            case 5:
                System.out.println("Grade B");
                break;
            case 4:
                System.out.println("Grade C");
                break;
            case 3:
                System.out.println("Grade D");
                break;
            case 2:
                System.out.println("Grade E");
                break;
            case 1:
                System.out.println("FAIL");
                break;

        }

    }

    public static void main(String[] args) {
        GradeCalculator gc = new GradeCalculator();
        gc.gradeChecker();
    }
}
