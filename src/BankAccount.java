public class BankAccount {
    private String accountNumber;
    private double balance;
    double deposit;
    double withdraw;
    public BankAccount(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
    public double getBalance()
    {
        return  balance;

    }
    public void depositMoney(double deposit)
    {
        this. deposit = deposit;
        System.out.println("Amount Deposited in Rupees: "+deposit);
        balance+=deposit;
        System.out.println("Account Balance after Deposit in Rupees: "+balance);
    }
public void withdrawMoney(double withdraw)
{
    this.withdraw = withdraw;
    System.out.println("Amount Withdrawn in Rupees: "+withdraw);
    balance -=withdraw;
    System.out.println("Account Balance after Withdrawal in Rupees: "+balance);

}

    public static void main(String[] args) {
        BankAccount bt = new BankAccount("SBIN0058992",15457.52);
        System.out.println("Account Number: "+bt.accountNumber);
        System.out.println("Balance in the account in Rupees: "+bt.balance);
        bt.depositMoney(2500);
        bt.withdrawMoney(1200);
    }
}
