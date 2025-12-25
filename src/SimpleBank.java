import javax.security.auth.login.AccountNotFoundException;
import java.util.Scanner;

public class SimpleBank {
    Scanner sc = new Scanner(System.in);
    String validAccNum = "SBI1234";
    double currentBalance = 75000.52;

    double deposit;

    public void createAccount() {
        try {
            System.out.println("Enter your Account Number: ");

            String accNum = sc.nextLine();
            if (!accNum.equals(validAccNum)) {

                throw new AccountNotFoundException("Error: Invalid Account Number" + accNum);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } System.out.println("Initial Balance in Rupees: " + currentBalance);
    }

    public void depositAccount() {

        try{
        System.out.println("Enter amount to be deposited in Rupees: ");
        deposit = sc.nextDouble();

        if (deposit<100)
        {
         throw new RuntimeException("Error: Deposit amount greater than 100");
        }
            currentBalance+=deposit;
            System.out.println("Balance after deposit in Rupees:  " + currentBalance);



        } catch (Exception e)
        { throw new RuntimeException(e);

        }
    }
    public void withdrawAccount()
    {
        try {
            System.out.println("Enter the amount to be withdrawn in Rupees: ");

            double withdraw = sc.nextDouble();
            if (withdraw > currentBalance) {
                throw new RuntimeException("ERROR: INSUFFICIENT FUNDS");
            }

            currentBalance-= withdraw;
            System.out.println("Account Balance after Withdrawal in Rupees: " + currentBalance);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public void transferAccount()
    {
        try {
            System.out.println("Enter the Amount to be transferred in Rupees: ");
            double transfer = sc.nextDouble();
            if(currentBalance<transfer)
            {
                throw new RuntimeException("ERROR: INSUFFICIENT FUNDS TO TRANSFER");
            }
            currentBalance-=transfer;
            System.out.println("Account after transfer of amount in Rupees: "+currentBalance);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public void displayAccount()
    {
        System.out.println("Account details after all transactions");
        System.out.print("Account Number: "+validAccNum);
        System.out.println("Current Balance in Rupees: "+currentBalance);
    }

    public static void main(String[] args) {
        SimpleBank sb = new SimpleBank();
        sb.createAccount();
        sb.depositAccount();
        sb.withdrawAccount();
        sb.transferAccount();
        sb.displayAccount();
    }
}

