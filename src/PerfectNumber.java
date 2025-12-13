import java.util.Scanner;

public class PerfectNumber {
    Scanner sc = new Scanner(System.in);
    int N;
    public void perfectNumChecker() {
        int sum = 0;
        System.out.println("Enter the Number:");
        N = sc.nextInt();
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == N) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a perfect number");
        }
    }

    public static void main(String[] args) {
        PerfectNumber pn = new PerfectNumber();
        pn.perfectNumChecker();
    }
}
