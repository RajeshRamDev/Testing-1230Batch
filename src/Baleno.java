public class Baleno extends Inheritance
{
    public void tyreSize(int tyre)
    {
        System.out.println("Tyre size is "+tyre+" inches");
    }

    public static void main(String[] args) {
        Baleno bl = new Baleno();
        bl.carName("Alto");
        bl.modelName("ALTO2025");
        bl.yearMethod(2025);
        bl.tyreSize(5);
    }
}
