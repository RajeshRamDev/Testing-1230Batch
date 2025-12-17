
public class Circle implements Drawable{
    @Override
    public void Draw() {
        double radius=85.25;
        System.out.println("Draw circle with radius: "+radius+" centi-meter");
        double  circle =3.14* radius*radius;
        System.out.println("The circle drawn is of Area: "+circle);
    }

    public static void main(String[] args) {
        Circle cc = new Circle();
        cc.Draw();

    }
}
