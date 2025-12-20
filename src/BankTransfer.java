public class BankTransfer extends PaymentAbs{
    @Override
    public void makePayment(double amount) {
        System.out.println("Amount transferred through Bank Transfer in Rupees: "+amount);

    }

    public static void main(String[] args) {
        BankTransfer bt = new BankTransfer();
        bt.makePayment(8512.52);
    }
}

