import java.util.Scanner;

public class LoginSystem
    {
        Scanner sc = new Scanner(System.in);
        String username;
        String password;
        public void loginSys()
        {
            System.out.println("Enter Username:");
            username = sc.nextLine();
            System.out.println("Enter password:");
            password = sc.nextLine();
            if(username.equals("Rajesh")&& password.equals("R@j50"))
            {
                System.out.println("Valid userid and password");
            }
            else {
                System.out.println("Invalid entry");
            }
        }

        public static void main(String[] args) {
        LoginSystem ls = new LoginSystem();
        ls.loginSys();
    }
    }


