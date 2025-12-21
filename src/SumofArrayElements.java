public class SumofArrayElements {
    int []A = {1,2,3};
    public void sumMethod()
    { int sum =0;
        for (int i=0;i<A.length;i++)
        {
            for (int j=1;j<A.length;j++)
            {
               sum = A[i]+A[j];
            }
        }
        System.out.println("Sum of Elements of the array: "+sum);
    }

    public static void main(String[] args) {
        SumofArrayElements sa = new SumofArrayElements();
        sa.sumMethod();
    }
}
