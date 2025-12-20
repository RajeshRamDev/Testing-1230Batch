public class MobilePayment extends PaymentAbs{
    @Override
    public void makePayment(double amount) {
        System.out.println("Amount transferred through Mobile Payment in Rupees: "+amount);

    }

    public static void main(String[] args) {
        MobilePayment bt = new MobilePayment();
        bt.makePayment(5512.22);
    }
}

