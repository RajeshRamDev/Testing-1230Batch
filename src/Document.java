
public class Document implements Printable{
    @Override
    public void print() {
        System.out.println("Printing the Document");
    }

    public static void main(String[] args) {
        Document dt = new Document();
        dt.print();
    }
}

