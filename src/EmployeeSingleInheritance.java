public class EmployeeSingleInheritance extends PersonSingleInheritance{
    String employeeID;
    public void displayEmployeeInfo(String employeeID)
    {
        this.employeeID = employeeID;
        System.out.println("Employee ID: "+employeeID);
    }

    public static void main(String[] args) {
        EmployeeSingleInheritance es = new EmployeeSingleInheritance();
        es.displayInfo("Rajesh",30);
        es.displayEmployeeInfo("EMP00568");
    }
}
