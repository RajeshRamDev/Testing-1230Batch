public class GuitarCasting extends InstrumentCasting{
    @Override
    public void play() {
        System.out.println("Play Guitar");
    }
    public void strings()
    {
        System.out.println("Guitar has Strings");
    }


    public static void main(String[] args) {
        //UPCASTING with Polymorphism
        InstrumentCasting ic = new GuitarCasting();
        ic.play();
        //DOWNCASTING
        GuitarCasting gc = (GuitarCasting) ic;
        gc.play();
        gc.strings();
    }
}
