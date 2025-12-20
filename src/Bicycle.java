public class Bicycle extends VehicleAbs{
    @Override
    public void move() {
        System.out.println("Move Bicycle");
    }

    public static void main(String[] args) {
        Bicycle bi = new Bicycle();
        bi.move();
    }
}
