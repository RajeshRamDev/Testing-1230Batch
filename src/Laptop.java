public class Laptop {
    private String brand, model;
    public Laptop(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
        System.out.println("Laptop:"+brand+"\t"+model);
    }

    public static void main(String[] args)
    {

        Laptop lp = new Laptop("Dell","Inspiron");
    }

}