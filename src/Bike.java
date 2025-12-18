public class Bike extends Vehicle{
public Bike(int speed, int fuel)
{
    this.speed = speed;
    this.fuel = fuel;

}
public void displayBikeStatus()
{
    showStatus(100,3);
}

    public static void main(String[] args) {
        Bike bk = new Bike(45,1);
        bk.displayBikeStatus();
    }
}
