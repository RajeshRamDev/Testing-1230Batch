public class CustomerAccount extends Account {
    String customerId;
    public void printCustomerDetails(String customerId)
    {
        this.customerId = customerId;
        System.out.println("Customer ID: "+customerId);
    }

    public static void main(String[] args) {
        CustomerAccount ca = new CustomerAccount();
        ca.printCustomerDetails("SBI0015285");
        ca.printAccount("Rajesh",10000.75);
    }

}
