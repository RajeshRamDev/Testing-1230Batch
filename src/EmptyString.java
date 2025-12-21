import java.util.Scanner;

public class EmptyString {
    Scanner sc = new Scanner(System.in);
    String string;
    public void emptyChecker()
    {
        System.out.println("Empty String Checker");
        System.out.println("Enter the string: ");
        string = sc.nextLine();
        if(string.isEmpty())
        {
            System.out.println("String is empty");
        }
        else {
            System.out.println("String is not empty");
        }
    }
public void upperCaseConverter()
{
    System.out.println("UPPER CASE CONVERTER");
    System.out.println("Enter the string: ");
    string = sc.nextLine();

    System.out.println("String in Upper case is: "+string.toUpperCase());
}
    public void lowerCaseConverter()
    {
        System.out.println("lower case converter");
        System.out.println("Enter the string: ");
        string = sc.nextLine();

        System.out.println("String in lower case is: "+string.toLowerCase());
    }
    public void concatString()
    {
        System.out.println("Concatenation of TWO STRINGS");
        System.out.println("Enter the string: ");
     String string = sc.nextLine();
        System.out.println("Concatenating String 1 and String 2: "+string.concat(" Coding"));
    }
    public void lengthofString()
    {
        System.out.println("Length of STRING");
        System.out.println("Enter the string: ");
        String string = sc.nextLine();
        System.out.println("Length of the string is: "+string.length());
    }
    public void substringCheck()
    {
        System.out.println("Sub String Check");
        String s1 = "Implementation of String in Java Programming"; String s2 = "Java";
        if(s1.contains(s2))
        {
            System.out.println("The sub string is : "+s2+" is found");
        }
        else {
            System.out.println("The sub string is : "+s2+" is NOT found");
        }
    }
    public void replaceChar()
    {
        System.out.println("Replace Character in String");
        String S =  "JAVA";
        System.out.println("Replace A by O in the string: "+S.replace('A','O'));

    }
    public void equalChecker()
    {
        System.out.println("Check if Strings are equal");
        String S1 = "JAVA"; String S2 = "PROGRAMMING";
        if(S1.equals(S2))
        {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are Not Equal");
        }
    }










    public static void main(String[] args) {
        EmptyString es = new EmptyString();
        es.emptyChecker();
        es.upperCaseConverter();
        es.lowerCaseConverter();
        es.concatString();
        es.lengthofString();
        es.substringCheck();
        es.replaceChar();
        es.equalChecker();
    }
}
