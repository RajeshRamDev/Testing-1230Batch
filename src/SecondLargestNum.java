public class SecondLargestNum {
    int []A = {10,20,40,30,50};
    public void secondLargestChecker()
    { int largest = Math.max(A[0],A[1]);
        int secondlargest = Math.min(A[0],A[1]);
        for (int i=2;i<A.length;i++)
        {
            if(A[i]>largest)
            {
                secondlargest=largest;
                largest=A[i];
            } else if(A[i]>secondlargest&&A[i]!=largest)
            {
                secondlargest=A[i];
            }
        }
        System.out.println("The second largest number in the array is: "+secondlargest);


    }

    public static void main(String[] args) {
        SecondLargestNum sn = new SecondLargestNum();
        sn.secondLargestChecker();
    }
}
