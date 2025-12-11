public class Alto extends Inheritance
{
    public void engineMethod(String Capacity)
    {
        System.out.println("Capacity of the engine: "+Capacity);
    }
    public void tankCapacity(int tank)
    {
        System.out.println("Tank Capacity: "+tank);
    }

    public static void main(String[] args) {
        Alto ao = new Alto();
        ao.carName("Alto");
        ao.modelName("Alto");
ao.yearMethod(2024);
ao.engineMethod("20 litres");
ao.tankCapacity(12);
}
}