public class FirstLetterUpperCase {
    String S= "java is fun";
    public void capitalMaker()
    {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);

            if (i == 0 || S.charAt(i - 1) == ' ') {
                result.append(Character.toUpperCase(currentChar));
            } else {
                result.append(currentChar);
            }
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        FirstLetterUpperCase fu = new FirstLetterUpperCase();
        fu.capitalMaker();
    }

    }
