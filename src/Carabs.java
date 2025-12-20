public class Carabs extends VehicleAbs{
    @Override
    public void move() {
        System.out.println("Move Car");
    }

    public static void main(String[] args) {
        Carabs cs = new Carabs();
        cs.move();
    }
}
