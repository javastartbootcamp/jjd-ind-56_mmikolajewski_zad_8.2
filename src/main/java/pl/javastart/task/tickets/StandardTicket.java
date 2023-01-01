package pl.javastart.task.tickets;

import pl.javastart.task.Place;
import pl.javastart.task.tickets.Ticket;

public class StandardTicket extends Ticket {

    StandardTicket(String titleEvent, Place place, double basicPrice) {
        super(titleEvent, place, basicPrice);
        setType("Bilet standardowy");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println();
    }
}