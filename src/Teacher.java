public class Teacher extends School {
    String subject;
    public void displayTeacher(String subject)
    {
        this.subject = subject;
        System.out.println("Subject name: "+subject);
    }

    public static void main(String[] args) {
        Teacher tr = new Teacher();
        tr.showSchool("KV");
        tr.displayTeacher("Mathematics");
    }
}
