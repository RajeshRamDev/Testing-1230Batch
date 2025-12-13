import java.util.Scanner;

public class BubbleSort {
    Scanner sc = new Scanner(System.in);
    int []A;
    public void readArray() {
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        A = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < A.length; i++)
        {
            System.out.print("A["+i+"]:\t");
            A[i]=sc.nextInt();
        }
        System.out.println();
    }
    public void printArray()
    {
        System.out.println("The array is: ");
        for (int i = 0; i < A.length; i++)
        {
            System.out.print(A[i]+"\t");
        }
        System.out.println();
    }

    public void bubbleSorter()
    {
        int n = A.length;
        int temp;
        boolean swapped;

        System.out.println("Bubble Sort Start: ");

        for (int i =0; i <n-1; i++)
        {
            swapped = false;

            for(int j=0; j<n-i-1; j++)
            {
                if(A[j] > A[j+1])
                {

                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    swapped = true;
                }
            }

            if (swapped==false)
            {
                System.out.println("Array sorted early after pass " + (i + 1));
                break;
            }
        }
    }
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        bs.readArray();
        bs.printArray();
        bs.bubbleSorter();
        bs.printArray();
    }

}



