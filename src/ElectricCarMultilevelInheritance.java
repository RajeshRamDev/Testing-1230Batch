public class ElectricCarMultilevelInheritance extends CarMultilelvelInterhitance{
    double capacity;
    public void displayCapacity(double capacity)
    {
        this.capacity = capacity;
        System.out.println("Battery capacity: "+capacity+" kWh");
    }

    public static void main(String[] args) {
        ElectricCarMultilevelInheritance em = new ElectricCarMultilevelInheritance();
        em.displayBrand("BMW");
        em.displayModel("iX1LWB(Long Wheel Base)");
        em.displayCapacity(66.40);

    }
}
