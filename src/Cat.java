public class Cat extends Dog{
    @Override
    public void makeSound() {
        System.out.println("Cat Meows");
    }

    public static void main(String[] args) {
        Cat ct = new Cat();
        ct.makeSound();
        Dog dg = new Dog();
        dg.makeSound();
    }
}
