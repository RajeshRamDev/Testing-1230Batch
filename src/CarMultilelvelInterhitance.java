public class CarMultilelvelInterhitance extends VehicleMultilevelInheritance {
    String model;
    public void displayModel(String model)
    {
        this.model = model;
        System.out.println("Car model: "+model);
    }

    public static void main(String[] args) {
        CarMultilelvelInterhitance cm = new CarMultilelvelInterhitance();
        cm.displayBrand("BMW");
        cm.displayModel("iX1LWB(Long Wheel Base)");
    }

}
