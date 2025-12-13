public class LogicalOperators {
    int a;
    int b;
    boolean condn;

    public void logOpt(int a, int b) {
        if (a>5 && b<10) {
            System.out.println("a is greater than 5 and b is less than 10");
        } else if (a>5 || b<10) {
            System.out.println("Either a is greater than 5 or b is less than 10");

        } else {
            System.out.println(a + " Is Not equal to" + b);
        }
    }
    public void notOpt(boolean condn)
    {
        boolean not = !condn;
        System.out.println(not);
    }

    public static void main(String[] args) {
        LogicalOperators lo = new LogicalOperators();
        lo.logOpt(7,8);
        lo.notOpt(true);
    }


}
