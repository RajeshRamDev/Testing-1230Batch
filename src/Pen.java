public class Pen {
        private String color;
        private  int price;
        public Pen()
        {
            System.out.println("Default Pen");
        }
        public Pen(String color)
        {
            this.color = color;
            System.out.println("Colour: "+color);
        }
        public Pen(int Price)
        {
            this.price = price;
            System.out.println("Price: "+Price);
        }

        public static void main(String[] args) {
            Pen pn = new Pen();
            Pen p1 = new Pen("Blue");
            Pen p2 = new Pen(10);
        }

    }

