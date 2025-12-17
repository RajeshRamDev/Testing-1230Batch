
public class ImageFile implements Printable{
    @Override
    public void print() {
        System.out.println("Printing Image file with correct resolution and color combination");

    }

    public static void main(String[] args) {
        ImageFile ie = new ImageFile();
        ie.print();
    }
}

