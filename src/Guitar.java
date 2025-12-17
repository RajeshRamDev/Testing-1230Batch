public class Guitar implements Playable{

    @Override
    public void play() {
        System.out.println("Play Guitar");
    }

    public static void main(String[] args) {
        Guitar gr = new Guitar();
        gr.play();
    }
}