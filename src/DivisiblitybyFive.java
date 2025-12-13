import java.util.Scanner;

public class DivisiblitybyFive
    {
        Scanner sc = new Scanner(System.in);
        int num;
        public void divFive()
        {
            System.out.println("Enter the number:");
            num= sc.nextInt();
            if(num%5==0)
            {
                System.out.println(num+" Is Divisible by 5");
            }
            else {
                System.out.println(num+" Is Not Divisible by 5");
            }
        }

        public static void main(String[] args) {
            DivisiblitybyFive df= new DivisiblitybyFive();
            df.divFive();
        }
    }


