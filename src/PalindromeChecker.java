import java.util.Scanner;

public class PalindromeChecker {
    Scanner sc = new Scanner(System.in);
    String word;
    String revword="";
    public void palindromeMethod()
    {
        System.out.println("Enter the word ");
        word = sc.nextLine();
        for(int i= word.length()-1;i>=0;i--)
        {
            revword+=word.charAt(i);
        }
        if (word.equalsIgnoreCase(revword))
        {
            System.out.println(word+ " Is a palindrome");
        }
        else
        {
            System.out.println(word+ " Is not a palindrome");
        }

    }

    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker();
        pc.palindromeMethod();
    }
}

