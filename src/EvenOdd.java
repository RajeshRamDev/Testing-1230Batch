import java.util.Scanner;

public class EvenOdd {
    Scanner sc = new Scanner(System.in);
    int num;
    public void evenoddChecker()
    {
        String checker = "";
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        checker = ((num%2)==0)?"Even":"Odd";
        System.out.println(checker);
        sc.close();
    }

    public static void main(String[] args) {
        EvenOdd eo = new EvenOdd();
        eo.evenoddChecker();
    }
}


