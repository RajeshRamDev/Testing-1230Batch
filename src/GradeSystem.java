public class GradeSystem {
    int marks;

    public void gradSys(int marks) {
        this.marks = marks;
        if (marks<=100 && marks>=0) {
            if (marks <= 100 && marks > 90) {
                System.out.println(" Grade A ");
            } else if (marks <= 90 && marks > 80) {
                System.out.println(" Grade B ");
            } else if (marks <= 80 && marks > 60) {
                System.out.println(" Grade C ");
            } else if (marks <= 60 && marks >= 40) {
                System.out.println(" Grade D");
            } else if (marks < 40 && marks >= 0) {
                System.out.println(" Grade F");

            }
        } else {
            System.out.println("Enter marks between 0 to 100");
        }

    }

    public static void main(String[] args) {
        GradeSystem gs = new GradeSystem();
        gs.gradSys(52);
    }
}


