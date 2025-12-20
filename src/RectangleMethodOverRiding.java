public class RectangleMethodOverRiding extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public static void main(String[] args) {
        RectangleMethodOverRiding rm = new RectangleMethodOverRiding();
        rm.draw();
    }
}
