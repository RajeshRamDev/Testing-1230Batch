public class NumberReverseOrder {
    public  void numbRev(int num)
    {
        System.out.println("Numbers in reverse order");
        for(int i =10; i>=1;i--)
        {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NumberReverseOrder nr = new NumberReverseOrder();
        nr.numbRev(10);
    }
}

