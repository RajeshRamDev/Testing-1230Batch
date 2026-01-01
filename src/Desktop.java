public class Desktop extends ComputerCasting{
    @Override
    public void compute() {
        System.out.println("Turn on the Desktop to compute");
    }
    public void  cpu()
    {
        System.out.println("Turn on the CPU too to switch on the Desktop");
    }

    public static void main(String[] args) {
        //UPCASTING WITH POLYMORPHISM
        ComputerCasting cc = new Desktop();
        cc.compute();
        //DOWNCASTING
        Desktop dc = (Desktop) cc;
        dc.cpu();
        dc.compute();

    }
}
