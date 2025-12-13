public class RelationalOperators {
    int a;
    int b;

    public void relOpt(int a, int b)
    {
        if(a==b) {
            System.out.println(" Is Equal to ");
        } else if (a > b) {
            System.out.println( " Is greater than ");
        } else if (a < b) {
            System.out.println(" Is lesser than " );

        } else if (a >= b) {
            System.out.println( " Is greater than or equal to " );

        } else if (a <= b) {
            System.out.println( " Is lesser than or equal to " );

        } else {
            System.out.println(a + " Is Not Equal to " +b);
        }
    }
    public static void main(String[] args) {
        RelationalOperators ro = new RelationalOperators();
        ro.relOpt(10,20);
    }
}



