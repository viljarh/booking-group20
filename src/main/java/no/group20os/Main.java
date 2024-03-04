package no.group20os;

import no.group20os.booking.MovieTicketClient;
import no.group20os.booking.MovieTicketServer;

public class Main {
    public static void main(String[] args) {
        MovieTicketServer server = new MovieTicketServer("Dune 2", 10);

        Thread t1 = new MovieTicketClient(server, "Customer 1", 3);
        Thread t2 = new MovieTicketClient(server, "Customer 2", 4);
        Thread t3 = new MovieTicketClient(server, "Customer 3", 2);
        Thread t4 = new MovieTicketClient(server, "Customer 4", 4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}