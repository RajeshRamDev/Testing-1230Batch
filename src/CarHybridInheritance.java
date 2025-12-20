public class CarHybridInheritance extends VehicleHybridInheritance implements Engine
{
    @Override
    public void start() {
        System.out.println("Start the car");


    }

    @Override
    public void Run() {
        System.out.println("Run the car");
    }

    public static void main(String[] args) {


       CarHybridInheritance ch = new CarHybridInheritance();
        ch.start();
        ch.Run();

    }
}
