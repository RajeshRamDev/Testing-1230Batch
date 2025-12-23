import java.util.Set;
import java.util.TreeSet;

public class NumSet {
    Set<Integer>num = new TreeSet<>();
    public void numMethod()
    {
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println("Integer set");
        for (int n:num)
        {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        NumSet ns = new NumSet();
        ns.numMethod();
    }
}
