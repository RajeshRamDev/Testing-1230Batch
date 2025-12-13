public class VowelConsonant {
        char ch;
        public  void vowelCheck( char ch)
        {
            this. ch = ch;
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'||ch=='U')
            {
                System.out.println(ch+ " Is a Vowel");
            }
            else {
                System.out.println(ch+ " Is a Consonant");
            }
        }

        public static void main(String[] args) {
            VowelConsonant vc = new VowelConsonant();
            vc.vowelCheck('E');
        }
    }


