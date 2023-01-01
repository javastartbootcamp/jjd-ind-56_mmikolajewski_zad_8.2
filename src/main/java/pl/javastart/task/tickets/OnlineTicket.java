package pl.javastart.task.tickets;

import pl.javastart.task.Place;
import pl.javastart.task.tickets.Ticket;

public class OnlineTicket extends Ticket {
    OnlineTicket(String titleEvent, Place place, double basicPrice) {
        super(titleEvent, place, basicPrice);
        setType("Bilet internetetowy");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println();
    }
}