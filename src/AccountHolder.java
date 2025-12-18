public class AccountHolder extends Bank{
    String accountName;
    public void accHolderMethod(String accountName)
    {
        this.accountName = accountName;
        System.out.println("Account Holder's Name: "+accountName);
    }

    public static void main(String[] args) {
        AccountHolder ah = new AccountHolder();
        ah.accHolderMethod("Rajesh");
        ah.printBankDetails("SBI","SBI1243");
    }
}
