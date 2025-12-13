import java.util.Scanner;

public class GradeAssignment {
    Scanner sc = new Scanner(System.in);
    int marks;
    public void gradeMethod()
    {
        char grade;
        System.out.println("Enter the marks between 0 to 100 : ");
        marks=sc.nextInt();
        grade =(marks>=90)?'S'
                :(marks>=80)?'A'
                : (marks>=70)?'B'
                :(marks>=60)?'C'
                :(marks>=50)?'D'
                :(marks>=40)?'E'
                :'F';
        System.out.println(grade);
        sc.close();

    }

    public static void main(String[] args) {
        GradeAssignment ga = new GradeAssignment();
        ga.gradeMethod();
    }
}
