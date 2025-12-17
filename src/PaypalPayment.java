public class PaypalPayment implements Payment
{
    @Override
    public void processPayment(long credit) {
        int creditpin = 5236;
        System.out.println("Enter the Credit Card number: "+credit);
        System.out.println("Enter pin:" +creditpin);
        System.out.println("Payment made");

    }

    public static void main(String[] args) {
        PaypalPayment pp = new PaypalPayment();
        pp.processPayment(52850013);
    }
}

