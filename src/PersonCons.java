public class PersonCons {
        private int age;
        private  String name;
        public PersonCons()
        {
            System.out.println("Default Constructor Called");
        }
        public PersonCons(String name)
        {
            this.name = name;
            System.out.println("Name: "+name);
        }
        public PersonCons(String name,int age)
        {
            this. name = name;
            this . age = age;
            System.out.println("Name: "+name+"\tAge: "+age);
        }

        public static void main(String[] args) {
            PersonCons p1 = new PersonCons();
            PersonCons p2 = new PersonCons("Riya");
            PersonCons p3 = new PersonCons("Riya",25);

        }
    }

