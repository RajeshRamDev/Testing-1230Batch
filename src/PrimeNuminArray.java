public class PrimeNuminArray {
        int []A = {4,5,6,7,8,11};
        public void primeChecker()
        {

            for (int num : A) {
                boolean prime = true;
                for (int i=2;i<num;i++)
                {
                    if(num%i == 0)
                    {
                        prime = false;
                        break;
                    }
                }
                if(prime)
                {
                    System.out.println(num);
                }
            }

        }

        public static void main(String[] args) {
            PrimeNuminArray pa = new PrimeNuminArray();
            pa.primeChecker();
        }

    }


