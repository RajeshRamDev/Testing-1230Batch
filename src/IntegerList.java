import java.util.LinkedList;
import java.util.List;

public class IntegerList {
    List<Integer>nums = new LinkedList<>();
    public void integerListPrinter()
    {
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        System.out.println("lINKED LIST to print 5 different Numbers");
        for (int n:nums)
        {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        IntegerList il = new IntegerList();
        il.integerListPrinter();
    }

}
