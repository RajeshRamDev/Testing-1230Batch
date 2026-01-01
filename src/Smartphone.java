public class Smartphone extends DeviceCasting{
    @Override
    public void turnOn()
    {
        System.out.println("UPCASTING");
        System.out.println("Executes Child class as we have used Polymorphism same method name for parent and child class");
        System.out.println("Long press button on Right side corner to Turn on Smart Phone");
    }
    public void call()
    {
        System.out.println("Normal method for child class");
        System.out.println("Pick up the call");
    }

    public static void main(String[] args) {
        DeviceCasting dc = new Smartphone();
        dc.turnOn();
        //DOWN CASTING
        Smartphone sp = (Smartphone) dc;
        dc.turnOn();
        //Normal method for child class
        sp.call();




    }

}
