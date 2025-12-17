
public class Rectangle implements Drawable{
    @Override
    public void Draw() {
        double length = 52.55; double breadth = 25.45;
        System.out.println("Enter the length of the rectangle: "+length);
        System.out.println("Enter the breadth of the rectangle: "+breadth);
        double rectangle = length * breadth;
        System.out.println("The area of the rectangle is: "+rectangle+" centi-meters.");
    }

    public static void main(String[] args) {
        Rectangle rr = new Rectangle();
        rr.Draw();
    }
}
