
public class CreditCardPayment implements Payment{

    @Override
    public void processPayment(long credit) {
        System.out.println("Enter Credit Card number: "+credit);

    }

    public static void main(String[] args) {
        CreditCardPayment cc = new CreditCardPayment();
        cc.processPayment(52850013);
    }
}

