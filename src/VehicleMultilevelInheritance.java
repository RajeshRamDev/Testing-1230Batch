public class VehicleMultilevelInheritance {
    String brand;
    public void displayBrand(String brand)
    {
        this.brand = brand;
        System.out.println("Brand of the Car: "+brand);
    }

    public static void main(String[] args) {
        VehicleMultilevelInheritance vm = new VehicleMultilevelInheritance();
        vm.displayBrand("BMW");
    }
}
