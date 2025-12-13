public class OddEven {
    public void oddEven(int a)
    {
        if(a%2==0)
        {
            System.out.println(a+ " Is an even number");
        }
        else
        {
            System.out.println(a+ " Is an odd number");
        }
    }

    public static void main(String[] args) {
        OddEven oe = new OddEven();
        oe.oddEven(5);
    }
}
