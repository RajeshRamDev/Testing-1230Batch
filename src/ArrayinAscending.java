import java.util.Scanner;

public class ArrayinAscending {
    Scanner sc = new Scanner(System.in);
    int[]A;
    public void getArray()
    {
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
       A = new int[size];
        System.out.println("Enter the elements in the array: ");
       for (int i=0;i<A.length;i++)
       {
           System.out.println("A["+i+"]");
           A[i] =sc.nextInt();
       }
    }
    public void displayArray()
    {
        System.out.println("Display the array: ");
        for (int i=0;i<A.length;i++)
        {
            System.out.println("A["+i+"]: "+A[i]);
        }
    }
    public void ascendingSorter()
    {
        System.out.println("Elements in Ascending Order in the Array: ");
        for (int i=0;i<A.length;i++)
        {
            for (int j=i+1;j<A.length;j++)
            {
                if(A[i]>A[j])
                {
                    int swap=A[i];
                    A[i] =A[j];
                    A[j]= swap;

                }

            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayinAscending aa = new ArrayinAscending();
        aa.getArray();
        aa.displayArray();
        aa.ascendingSorter();
        aa.displayArray();
    }
}
