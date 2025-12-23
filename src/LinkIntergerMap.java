import java.util.LinkedHashMap;
import java.util.Map;

public class LinkIntergerMap {
    Map<Integer,String>num = new LinkedHashMap<>();
    public void linkMethod()
    {
        num.put(100,"Rajesh");
        num.put(200,"Ram");
        num.put(300,"Dev");
        num.put(400,"John");
        num.put(500,"Jack");
        for (Map.Entry<Integer,String>m:num.entrySet())
        {
            int key = m.getKey();
            String value = m.getValue();
            System.out.println("Key: "+key);
            System.out.println("Value: "+value);
        }

    }

    public static void main(String[] args) {
        LinkIntergerMap lm = new LinkIntergerMap();
        lm.linkMethod();
    }
}
