public class RemoveVowel {
    public String vowelRemover(String S)
    {
        String S1 = S.replaceAll("[aeiouAEIOU]", "");
        return S1;


    }

    public static void main(String[] args) {
        RemoveVowel rv = new RemoveVowel();
        String S = "Hello World";
        System.out.println("Input string: "+S);
        String S1 = rv.vowelRemover(S);
        System.out.println("String without vowels: "+S1);

    }
}
