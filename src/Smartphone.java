public class Smartphone extends Device{
    @Override
    public void turnOn() {
        System.out.println("Long press button on Right side corner to Turn on Smart Phone");
    }

    public static void main(String[] args) {
        Smartphone sp = new Smartphone();
        sp.turnOn();
    }
}
