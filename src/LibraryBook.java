public class LibraryBook extends Book{
    int shelfNo;
    public LibraryBook(String title,String author,int shelfNo)
    {
        super(title, author);
        this.shelfNo =shelfNo;

        System.out.println("Shelf Number: "+shelfNo);
    }
    public void displayLibraryBook()
    {
        System.out.println("Title: "+title+"\tAuthor: "+author+"\tShelf Number: "+shelfNo);
    }

    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("Java Programming","Dr.Mark",15);
        lb.displayLibraryBook();

    }
}
