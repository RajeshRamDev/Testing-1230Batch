public class RectangleCons {

        private int length, breadth;
        public RectangleCons(int length,int breadth)
        {
            this.length = length;
            this.breadth = breadth;
            int area = length*breadth;
            System.out.println("Area of the rectangle is: "+area+" square centi meters");
        }

        public static void main(String[] args) {
            RectangleCons re = new RectangleCons(10,5);
        }

    }
