public class ZerosinArray {
    int []A={0,1,0,2,3,0};
        public void zerosArray()
        {
            int count=0;
            System.out.println("The number of zeros in the array is: ");
            for(int i=0;i<A.length;i++)
            {
                if(A[i]==0)
                {
                    count=count+1;


                }

            }System.out.println(count);
        }

        public static void main(String[] args) {
            ZerosinArray za = new ZerosinArray();
            za.zerosArray();
        }
    }


