public class Car
{ String make; String Model; int year;
    public void makeMethod(String make)
    { this.make = make;
        System.out.println("Make of the car is: "+make);
    }
    public void modelMethod(String Model)
    { this.Model = Model;
        System.out.println("Make of the car is: "+Model);
    }
    public void yearMethod(int year)
    { this.year = year;
        System.out.println("Make of the car is: "+year);
    }

    public static void main(String[] args) {
        Car cr = new Car();
        cr.makeMethod("Tesla");
        cr.modelMethod("Model Y");
        cr.yearMethod(2023);
    }


}
