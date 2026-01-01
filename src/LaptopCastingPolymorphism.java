public class LaptopCastingPolymorphism extends DeviceCasting{
    @Override
    public void turnOn() {
        System.out.println("Long Press Power Button to Turn ON Laptop");
    }

    public static void main(String[] args) {
        LaptopCastingPolymorphism lc = new LaptopCastingPolymorphism();
        lc.turnOn();
    }
}
