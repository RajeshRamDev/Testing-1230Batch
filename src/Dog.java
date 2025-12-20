public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog Barks");
    }

    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.makeSound();
    }
}
