public class Warrior extends GameCharacter{
    @Override
    public void attack() {
        System.out.println("Warrior Attack");
    }

    @Override
    public void defend() {
        System.out.println("Warrior Defend");

    }

    public static void main(String[] args) {
        Warrior wr = new Warrior();
        wr.defend();
        wr.attack();
    }
}
