public class PersonSingleInheritance {
    String name; int age;
    public void displayInfo(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Name of the employee: "+name);
        System.out.println("Age of the employee: "+age);
    }

    public static void main(String[] args) {
        PersonSingleInheritance ps = new PersonSingleInheritance();
        ps.displayInfo("Rajesh",30);
    }
}
