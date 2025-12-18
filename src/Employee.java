public class Employee extends Company{
    String employeeName;
    public void empName(String employeeName)
    {
        this.employeeName = employeeName;
        System.out.println("Employee Name: "+employeeName);
    }

    public static void main(String[] args) {
        Employee ee = new Employee();
        ee.showCompanyInfo("ABCD","Chennai");
        ee.empName("Rajesh");

    }
}
