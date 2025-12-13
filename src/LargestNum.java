public class LargestNum {
    int num1;
    int num2;
    public void largNumber(int num1,int num2 )
    {
        this.num1=num1;
        this.num2=num2;
        if(num1>num2)
        {
            System.out.println(num1 + " Is greater than " + num2);
        } else if (num1<num2) {
            System.out.println(num1 + " Is Lesser than " +num2);
        }
        else {
            System.out.println("Both are equal");
        }
    }

    public static void main(String[] args) {
        LargestNum ln = new LargestNum();
        ln.largNumber(10,20);
    }
}


