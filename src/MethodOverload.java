import java.util.Scanner;

public class MethodOverload {
    Scanner sc = new Scanner(System.in);
    int securepin;
    String securepass;

    public void unlockPhone(int pin)
    {
        this.securepin = pin;
        System.out.println(" Enter the pin: ");
        int userpin = sc.nextInt();
        if(userpin == securepin)
        {
            System.out.println(" Unlock Phone ");
        } else {
            System.out.println(" Wrong Pin ");
        } }
    public void unlockPhone(String pass)
    { this.securepass = pass;
        System.out.println("Enter the pin: ");
        String userpass = sc.next();
        if(userpass.equals(securepass))
        {
            System.out.println(" Unlock Phone ");
        } else {
            System.out.println(" Wrong Pin ");
        }
    }
    public static void main(String[] args) {
        MethodOverload mo = new MethodOverload();
        mo.unlockPhone(1234);
        mo.unlockPhone("abc");
    }
}
