import java.util.Scanner;

public class SecondLargestNumArray {
    Scanner sc = new Scanner(System.in);
    int []A;
    public void readArray()
    {
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        A=new int[size];
        for (int i=0;i<A.length;i++)
        {
            System.out.print("A["+i+"]:\t");
            A[i] = sc.nextInt();
        }
        System.out.println();
    }
    public void printArray()
    {
        System.out.println("The entered array is: ");
        for (int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+"\t");
        }
        System.out.println();
    }
    public void secondLargest()
    {
        int largest = Math.max(A[0],A[1]);
        int secondlargest = Math.min(A[0],A[1]);
        for (int i=0;i<A.length;i++)
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
        System.out.println("The largest number in the array is: "+largest);
        sc.close();
    }

    public static void main(String[] args) {
        SecondLargestNumArray sn = new SecondLargestNumArray();
        sn.readArray();
        sn.printArray();
        sn.secondLargest();
    }
}
