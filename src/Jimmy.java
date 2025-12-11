public class Jimmy extends Baleno
{
    public void categoryMethod(String category)
    {
        System.out.println("Category: "+category);

    }

    public static void main(String[] args) {
        Jimmy jm = new Jimmy();
        jm.carName("Alto");
        jm.yearMethod(2025);
        jm.modelName("ALTO 2024");
        jm.tyreSize(12);
        jm.categoryMethod("On road");
    }

}
