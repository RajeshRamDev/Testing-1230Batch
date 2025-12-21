public class ReplaceCharinString {
    String string = "Banana";
    public void replaceMethod()
    {
        String replace = string.replace('a','o');
        System.out.println(replace);
    }

    public static void main(String[] args) {
        ReplaceCharinString rs = new ReplaceCharinString();
        rs.replaceMethod();
    }
}
