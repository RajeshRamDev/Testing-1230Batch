public class BankAccountCons
    {
        private String accountHolder;
        private double balance;
        private double dep;
        public BankAccountCons(String accountHolder,double balance)
        {
            this.accountHolder = accountHolder;
            this.balance = balance;
            System.out.println("Account Holder: "+accountHolder+"\nInitial Balance: "+balance);
        }
        public void deposit(double balance,double dep)
        {
            this.balance = balance;
            this. dep = dep;
            double amt = balance+ dep;
            System.out.println("After Deposit: "+amt);
        }

        public static void main(String[] args) {
            BankAccountCons ba = new BankAccountCons("Anil",1000);
            ba.deposit(1000,500);

        }
    }


