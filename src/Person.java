public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPeron(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + "\tAge: " + age);
    }

    public static void main(String[] args) {
        Person pn = new Person("Rajesh",30);
        pn.displayPeron("Raj",25);
    }
}
