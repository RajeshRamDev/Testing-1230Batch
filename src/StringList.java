import java.util.ArrayList;
import java.util.List;

public class StringList {
    List<String>fruit = new ArrayList<>();
    public void fruitList()
    {
        fruit.add("Apples");
        fruit.add("Mangoes");
        fruit.add("Strawberries");
        fruit.add("Grapes");
        fruit.add("Bananas");
        System.out.println("List of 5 Fruits");
        for(String f: fruit)
        {
            System.out.println(f);
        }
    }

    public static void main(String[] args) {
        StringList sl = new StringList();
        sl.fruitList();
    }
}
