public class PosNegZeroInArray {
    int []A = {0,1,-2,3,-5,0};
    public void posChecker()
    { int positivecount=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>0)
            {
              positivecount++;
            }
        }
        System.out.println("Number of positive numbers in the array is: "+positivecount);
    }
    public void negChecker()
    { int negativecount=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]<0)
            {
                negativecount++;
            }
        }
        System.out.println("Number of negative numbers in the array is: "+negativecount);
    }
    public void zeroChecker()
    { int zerocount=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==0)
            {
                zerocount++;
            }
        }
        System.out.println("Number of Zeros in the array is: "+zerocount);
    }

    public static void main(String[] args) {
        PosNegZeroInArray pn = new PosNegZeroInArray();
        pn.posChecker();
        pn.negChecker();
        pn.zeroChecker();
    }
}
