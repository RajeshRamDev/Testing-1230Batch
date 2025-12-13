import java.util.Scanner;

public class ReverseString {
    Scanner sc = new Scanner(System.in);
    String string;
    public void revString()
    {
        System.out.println("Enter the string to be reversed: ");
        string=sc.nextLine();
        System.out.println("Reversed string is: ");
        for(int i=string.length()-1;i>=0;i--)
        {
            System.out.print(string.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        rs.revString();
    }
}


