import java.util.HashSet;
import java.util.Set;

public class CtitySet {
    Set<String>city = new HashSet<>();
    public void cityMethod()
    {
        city.add("Chennai");
        city.add("Bengaluru");
        city.add("Mumbai");
        city.add("Kochi");
        city.add("Hyderabad");
        System.out.println("Set of Cities");
        for(String s: city)
        {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        CtitySet cs = new CtitySet();
        cs.cityMethod();
    }
}
