public class PositiveNegative {
    public void posNeg(int a)
    {
        if(a>0)
        {
            System.out.println(a+" Is positive");
        } else if (a<0) {
            System.out.println(a + " Is Negative");
        } else {
            System.out.println(a+ " Is zero");
        }
    }

    public static void main(String[] args) {
        PositiveNegative pn = new PositiveNegative();
        pn.posNeg(10);
    }
}



