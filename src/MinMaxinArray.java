public class MinMaxinArray
{
    int []A = {12,15,82,1,97,32,-5,22};
    public void minMaxChecker()
    {
        int min =A[0]; int max = A[0];
        for (int i = 1; i< A.length; i++)
        {
            if(A[i]<min)
            {
                min = A[i];
            }

        }
        System.out.println("Minimum number in the Array is: "+min);
        for (int i = 1; i< A.length; i++)
        {
            if(A[i]>max)
            {
                max = A[i];
            }

        }
        System.out.println("Maximum number in the Array is: "+max);


    }


    public static void main(String[] args) {
        MinMaxinArray mm = new MinMaxinArray();
        mm.minMaxChecker();
    }
}
