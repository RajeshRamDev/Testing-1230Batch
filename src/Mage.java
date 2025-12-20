public class Mage extends GameCharacter{
    @Override
    public void attack() {
        System.out.println("Mage attack");
    }

    @Override
    public void defend() {
        System.out.println("Mage defend");

    }

    public static void main(String[] args) {
        Mage ma = new Mage();
        ma.attack();
        ma.defend();
    }
}
