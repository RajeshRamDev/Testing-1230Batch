public class Account {
    String accHolder;
    double balance;
    public void printAccount(String accHolder,double balance)
    {
        this.accHolder = accHolder;
        this.balance = balance;
        System.out.println("Name of the Account Holder: "+accHolder);
        System.out.println("Account Balance: Rs. "+balance);
    }

    public static void main(String[] args) {
        Account at = new Account();
        at.printAccount("Rajesh",10000.75);
    }
}
