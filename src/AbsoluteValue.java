import java.util.Scanner;

public class AbsoluteValue {
    Scanner sc = new Scanner(System.in);
    int num;
    public void absnumMethod()
    {
        int abs;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        abs = (num>0)?num
                :(num<0)?(num*-1)
                :0;
        System.out.println(abs+ " is the absolute value of "+num);
        sc.close();
    }

    public static void main(String[] args) {
        AbsoluteValue av = new AbsoluteValue();
        av.absnumMethod();
    }
}


