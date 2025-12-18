public class Vehicle {
     int speed, fuel;
    public void showStatus(int speed, int fuel)
    {
        this.speed = speed;
        this.fuel = fuel;
        System.out.println("Speed of the vehicle: " +speed+ " km per hour \t Fuel: "+fuel+" liters");
    }

    public static void main(String[] args) {
        Vehicle ve = new Vehicle();
        ve.showStatus(60,2);

    }
}
