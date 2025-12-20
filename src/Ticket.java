public class Ticket {
    private String movieName;
    private String seatNumber;
    private double price;

    public Ticket(String movieName) {
        this.movieName = movieName;
        System.out.println("Movie Name: " + movieName);
    }

    public Ticket(String movieName, String seatNumber) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        System.out.println("Movie Name:" + movieName + "\tSeat: " + seatNumber);
    }

    public Ticket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Movie Name:" + movieName + "\tSeat: " + seatNumber + "\tPrice: " + price);
    }

    public static void main(String[] args) {
        Ticket t1 = new Ticket("Avatar");
        Ticket t2 = new Ticket("Avatar", "A10");
        Ticket t3 = new Ticket("Avatar", "A10", 300);
    }
}

