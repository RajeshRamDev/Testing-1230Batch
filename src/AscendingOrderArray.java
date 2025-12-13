import java.util.Scanner;

public class AscendingOrderArray {
    Scanner sc = new Scanner(System.in);
    int []A;
    public void ascendingReader()
    {
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        A=new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<A.length;i++)
        {
            System.out.print("A["+i+"]:");
            A[i]=sc.nextInt();
        }
        System.out.println();
    }
    public void ascendingPrinter()
    {
        System.out.println("The Array is: ");
        for (int i=0;i<A.length;i++)
        {
            System.out.println("A["+i+"]:"+A[i]);

        }
        System.out.println();
    }
    public void ascendingChecker()
    {
        System.out.println("The elements in ascending order in the array: ");
        for (int i=0;i< A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            { int swap;
                if(A[i]>A[j])
                {
                    swap= A[i];
                    A[i]=A[j];
                    A[j]=swap;
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        AscendingOrderArray ao = new AscendingOrderArray();
        ao.ascendingReader();
        ao.ascendingPrinter();
        ao.ascendingChecker();
        ao.ascendingPrinter();
    }
}
