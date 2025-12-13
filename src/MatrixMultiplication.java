import java.util.Scanner;

public class MatrixMultiplication {
    Scanner sc = new Scanner(System.in);
    int[][] A, B, Product;
    int rowA, rowB, columnA, columnB;

    public void readMatrix() {
        System.out.println("Enter the number of rows of Matrix A:");
        rowA = sc.nextInt();
        System.out.println("Enter the number of columns of Matrix A:");
        columnA = sc.nextInt();
        System.out.println("Enter the number of rows of Matrix B:");
        rowB = sc.nextInt();
        System.out.println("Enter the number of columns of Matrix B:");
        columnB = sc.nextInt();
        A = new int[rowA][columnA];
        B = new int[rowB][columnB];
        Product = new int[rowA][columnB];
        if (columnA!= rowB) {
            System.out.println("Matrix multiplication not possible");
        }
        System.out.println("Enter the Matrix A: ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.println("A[" + i + "][" + j + "]:");
                A[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter the Matrix B: ");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.println("B[" + i + "][" + j + "]:");
                B[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public void printMatrix() {
        System.out.println("Matrix A is =  ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " \t ");
            }
            System.out.println();
        }
        System.out.println("Matrix B is =  ");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " \t ");
            }
            System.out.println();
        }
    }

    public void productMatrix() {
        System.out.println("The product of matrices A and B is = ");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnB; j++) {
                for (int k = 0; k < columnA; k++) {
                    Product[i][j] += A[i][k] * B[k][j];
                }
                System.out.print(Product[i][j] + " \t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixMultiplication mm = new MatrixMultiplication();
        mm.readMatrix();
        mm.printMatrix();
        mm.productMatrix();
    }
}
