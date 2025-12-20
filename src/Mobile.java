public class Mobile {
        public Mobile(String name,double price)
        {
            System.out.println("Brand: "+name+".Price in Rupees: "+price);
        }
        public Mobile(String name,long price)
        {
            System.out.println("Brand: "+name+",Price in Rupees: "+price);
        }

        public static void main(String[] args) {
            Mobile mo = new Mobile("Samsung",20000.00);
            Mobile me = new Mobile("Apple",60000);
        }

    }
