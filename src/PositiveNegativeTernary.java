import java.util.Scanner;

public class PositiveNegativeTernary
    {
        Scanner sc = new Scanner(System.in);
        int num;
        public  void posnegChecker()
        {
        String checker;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        checker = (num>0)?"Positive"
                :(num<0)?"Negative"
                :"Zero";
        System.out.println(num+" is "+checker);
        sc.close();
    }

    public static void main(String[] args) {
        PositiveNegativeTernary pn = new PositiveNegativeTernary();
        pn.posnegChecker();
    }
}
