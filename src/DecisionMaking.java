public class DecisionMaking
     {
        int a;
        public void ifStatement(int a) {
            this.a = a;
            if (a > 0) {
                System.out.println(a + " Is  positive");
            } else if (a < 0) {
                System.out.println(a + " Is  Negative");
            } else {
                System.out.println(a + " Is Zero");
            }
        }

        public static void main(String[] args) {
            DecisionMaking is = new DecisionMaking();
            is.ifStatement(0);
        }
    }


