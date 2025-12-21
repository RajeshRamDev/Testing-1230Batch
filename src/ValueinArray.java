public class ValueinArray {
    int []A = {5,6,12,8,15,17,44};
    public void valueChecker(int value)
    {
        boolean find = false;
        for(int i=0;i<A.length;i++) {
            if (A[i] == value) {
                find = true;
                System.out.println("Value is found at " + value + " at index number " + i + " in the array");
                break;
            }
        }
            if(!find)
            {
                System.out.println("Value "+value+" is not present in the array");
            }
    }

    public static void main(String[] args) {
        ValueinArray va = new ValueinArray();
        va.valueChecker(17);
        va.valueChecker(85);
    }
}
