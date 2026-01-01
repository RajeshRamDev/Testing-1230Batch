public class LaptopCasting extends ComputerCasting
{
    @Override
    public void compute() {
        System.out.println("Long Press Power button to Turn On the Laptop");
    }

    public static void main(String[] args) {
        LaptopCasting lc = new LaptopCasting();
        lc.compute();
    }
}
