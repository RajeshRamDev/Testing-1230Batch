public class NonFiction extends BookCasting {
    @Override
    public void read() {
        System.out.println("Read Non Fiction Books Alone");
    }

    public static void main(String[] args) {
        NonFiction nf = new NonFiction();
        nf.read();
    }
}
