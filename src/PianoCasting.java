public class PianoCasting extends InstrumentCasting {
    @Override
    public void play() {
        System.out.println("Play PIANO");
    }

    public static void main(String[] args) {
        PianoCasting pc = new PianoCasting();
        pc.play();
    }
}
