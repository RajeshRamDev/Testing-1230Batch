public class FirstLetterUpperCase {
    String S= "java is fun";
    public void capitalMaker()
    {
           for(int i=0;i<S.length();i++)
           {
               System.out.println(S.charAt(i));
               //System.out.println(S.charAt(0));
              // System.out.println(S.charAt(5));
               //System.out.println(S.charAt(7));

           }

    }

    public static void main(String[] args) {
        FirstLetterUpperCase fc = new FirstLetterUpperCase();
        fc.capitalMaker();
    }
}
