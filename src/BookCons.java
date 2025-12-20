public class BookCons
     {
        public BookCons(String title,int price)
        {
            System.out.println("Title: "+title+",Price in Rupees: "+price);
        }

        public static void main(String[] args) {
            BookCons bk = new BookCons("Java Basics",499);
        }
    }


