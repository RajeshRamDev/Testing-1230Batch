public class Bank {
    private String bankName;
    protected String branchCode;
    public void printBankDetails(String bankName,String branchCode)
    {
        this.bankName = bankName;
        this.branchCode = branchCode;
        System.out.println("Bank Name: "+bankName+"\tBranch Code: "+branchCode);
    }
}
