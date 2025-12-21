

public class ReverseAnArray {
    int []A = {2,3,4,5,6,7};
    public void reverseMethod()
    {
        System.out.println("Elements in Reverse in the Array");
        for (int i=A.length-1;i>=0;i--)
        {
            System.out.println(A[i]);
        }
    }

    public static void main(String[] args) {
        ReverseAnArray ra = new ReverseAnArray();
        ra.reverseMethod();
    }
}
