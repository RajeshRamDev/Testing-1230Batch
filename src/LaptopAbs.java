public class LaptopAbs extends Device{
    @Override
    public void turnOn() {
        System.out.println("Long press power button to Turn on Laptop");
    }

    public static void main(String[] args) {
        LaptopAbs la = new LaptopAbs();
        la.turnOn();
    }
}
