import java.util.Scanner;

public class MatrixAddition {
    Scanner sc = new Scanner(System.in);
    int [][]A,B,Sum;
    int rowA,rowB,columnA,columnB;
    public void readMatrix()
    {
        System.out.println("Enter the number of rows of Matrix A: ");
        rowA = sc.nextInt();
        System.out.println("Enter the number of columns of Matrix A: ");
        columnA=sc.nextInt();
        System.out.println("Enter the number of rows of Matrix B: ");
        rowB = sc.nextInt();
        System.out.println("Enter the number of columns of Matrix B: ");
        columnB=sc.nextInt();
        A = new int[rowA][columnA];
        B = new int[rowB][columnB];
        Sum = new int[rowA][columnA];
        if((rowA!=rowB)||(columnA!=columnB)) {
            System.out.println("Matrices should be of same dimension for Addition");

        }
        System.out.println("Enter Matrix A: ");
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                System.out.println("A["+i+"]["+j+"]:");
                A[i][j]=sc.nextInt();

            }
            System.out.println();
        }
        System.out.println("Enter Matrix B: ");
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B[i].length;j++)
            {   System.out.println("B["+i+"]["+j+"]:");
                B[i][j] = sc.nextInt();

            }
            System.out.println();
        }
    }
    public void printMatrix() {
        System.out.println("Matrix A is: ");
        for (int i = 0; i<A.length; i++) {
            for (int j = 0; j <A[i].length; j++) {
                System.out.print(A[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println("Matrix B is: ");
        for (int i = 0; i <B.length; i++) {
            for (int j = 0; j <B[i].length; j++) {
                System.out.print(B[i][j] + " \t ");
            }
            System.out.println();
        }
    }
    public void sumMatrix()
    {
        System.out.println("The sum of Matrices A and B is = :");
        for (int i=0;i<Sum.length;i++)
        {
            for(int j=0;j<Sum[i].length;j++)
            {
                Sum[i][j]= A[i][j]+B[i][j];
                System.out.print(Sum[i][j]+" \t ");
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        MatrixAddition ma = new MatrixAddition();
        ma.readMatrix();
        ma.printMatrix();
        ma.sumMatrix();
    }
}
