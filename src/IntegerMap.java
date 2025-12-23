import java.util.HashMap;
import java.util.Map;

public class IntegerMap {
    Map<Integer,String>num = new HashMap<>();
    public void integerMethod()
    {
        num.put(1,"ONE");
        num.put(2,"TWO");
        num.put(3,"THREE");
        num.put(4,"FOUR");
        num.put(5,"FIVE");
        System.out.println("HASH MAP SET");
        for (Map.Entry<Integer,String>m: num.entrySet())
        {
            int key = m.getKey();
            String value = m.getValue();
            System.out.println("Key: "+key);
            System.out.println("Value: "+value);
        }
    }

    public static void main(String[] args) {
        IntegerMap im = new IntegerMap();
        im.integerMethod();
    }
}
