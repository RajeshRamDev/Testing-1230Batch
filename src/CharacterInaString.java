
    import java.util.Scanner;

    public class CharacterInaString {
        Scanner sc = new Scanner(System.in);
        String name;
        public void getString()
        {
            System.out.println("Enter the string: ");
            name = sc.next();
            System.out.println("The number of characters in the string "+name+" is:  "+name.length());
        }

        public static void main(String[] args) {
            CharacterInaString cs = new CharacterInaString();
            cs.getString();
        }




    }
