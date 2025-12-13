public class OddNumbers {
    public void oddNum()
    {
        System.out.println("The odd numbers from 1 to 10 are:");
        for(int i=0;i<10;i++)
        {
            i=i+1;
            System.out.println(i);

        }
    }

    public static void main(String[] args) {
        OddNumbers on = new OddNumbers();
        on.oddNum();
    }

}

