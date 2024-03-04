package no.group20os.booking;

public class MovieTicketServer {
    private String movieName;
    private int availableSeats;

    public MovieTicketServer(String movieName, int availableSeats) {
        this.movieName = movieName;
        this.availableSeats = availableSeats;
    }

    public synchronized void bookTicket(String customerName, int numberOfSeats) {
        System.out.println("Hello! " + customerName + " : " + availableSeats + " Seats available for " + movieName);

        if (availableSeats < numberOfSeats) {
            System.out.println("Hello" + customerName + " : Seats not available for " + movieName);
            return;
        } else {
            availableSeats -= numberOfSeats;
            System.out.println("Hello" + customerName + " : " + numberOfSeats + " : Seats booked for " + movieName);
        }
    }
}
