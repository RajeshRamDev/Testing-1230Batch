import java.util.LinkedHashSet;
import java.util.Set;

public class CarSets {
    Set<String>car = new LinkedHashSet<>();
    public void carMethod()
    {
        car.add("BMW");
        car.add("Suzuki");
        car.add("Ford");
        car.add("Honda");
        car.add("MG");
        System.out.println("Set of cars");
        for(String s:car)
        {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        CarSets cs = new CarSets();
        cs.carMethod();
    }
}
