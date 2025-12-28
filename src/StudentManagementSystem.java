import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManagementSystem {
    HashMap<Integer,Student>student = new HashMap<>();
    public void addStudent(int id,String name,int age,char grade)
    {

        student.put(id,new Student(name,age,grade));
        System.out.println("Student ID "+id+" added successfully");
    }
    public void displayStudents(int id, String name, int age, char grade)
    {
        System.out.println("ID:"+id+"\tName: "+name+"\tAge: "+age+"\tGrade: "+grade);

    }
    public void removeStudent(int id)
    {
        if(student.containsKey(451)) {
            removeStudent(451);
            System.out.println("Student ID no."+id+" is removed");

        }
        else{
        System.out.println("Student ID no."+id+" is not found");
    }
    }
    public void listAllStudents()
    {
        System.out.println("List of all Students");
        for(Map.Entry<Integer,Student>m:student.entrySet())
        { int id = m.getKey();
            Student st = m.getValue();
            System.out.println("ID: "+id+" | "+st);
        }
    }

    public static void main(String[] args) {
        StudentManagementSystem sm = new StudentManagementSystem();
        sm.displayStudents(450,"Rajesh",31,'A');
        sm.displayStudents(451,"John",30,'D');
        sm.displayStudents(454,"Jimmy",28,'S');
        sm.displayStudents(455,"Bob",33,'C');
        sm.addStudent(452,"Jack",25,'A');
        sm.displayStudents(452,"Jill",26,'B');
        sm.removeStudent(451);
        sm.listAllStudents();


    }
}
