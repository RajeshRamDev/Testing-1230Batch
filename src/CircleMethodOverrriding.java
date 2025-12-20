public class CircleMethodOverrriding extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    public static void main(String[] args) {
        CircleMethodOverrriding cm = new CircleMethodOverrriding();
        cm.draw();
    }
}
