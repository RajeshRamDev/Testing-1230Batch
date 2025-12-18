public class Student extends Person{
   int rollNo;
    public Student(String name, int age,int rollNo)
    {
        super(name,age);
        this.rollNo = rollNo;

    }
    public void displayStudent(int rollNo)
    {

        System.out.println("Name: "+name+"\tAge: "+age+"\tRoll No.: "+rollNo);
    }

    public static void main(String[] args) {
        Student st = new Student("Rajesh",30,1250);
        st.displayPeron("Raj",28);
        st.displayStudent(1223);
    }

}
