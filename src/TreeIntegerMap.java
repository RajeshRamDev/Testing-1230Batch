import java.util.Map;
import java.util.TreeMap;

public class TreeIntegerMap {
    Map<Integer,String>num = new TreeMap<>();
    public void treeMethod()
    {
        num.put(111,"ABC");
        num.put(222,"DEF");
        num.put(152,"GHI");
        num.put(75,"LMN");
        num.put(20,"XYZ");
        System.out.println("Tree Map");
        for (Map.Entry<Integer,String>m:num.entrySet())
        {
            int key = m.getKey();
            String value = m.getValue();
            System.out.println("Key: "+key);
            System.out.println("Value: "+value);
        }
    }

    public static void main(String[] args) {
        TreeIntegerMap tm = new TreeIntegerMap();
        tm.treeMethod();
    }
}
