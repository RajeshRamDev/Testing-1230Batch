public class Fiction extends BookCasting{
    @Override
    public void read() {
        System.out.println("Read Only Fiction");
    }
    public void fictionMethod()
    {
        System.out.println("Agatha Christie is my favorite author in Fiction");
    }

    public static void main(String[] args) {
        //UPCASTING WITH POLYMORPHISM
        BookCasting bc = new Fiction();
        bc.read();
        //DOWNCASTING
        Fiction fn = (Fiction) bc;
        fn.read();
        fn.fictionMethod();

    }
}
