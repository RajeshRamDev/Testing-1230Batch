public class Piano implements Playable{
    @Override
    public void play() {
        System.out.println("Play Piano");
    }

    public static void main(String[] args) {
        Piano po = new Piano();
        po.play();
    }
}
