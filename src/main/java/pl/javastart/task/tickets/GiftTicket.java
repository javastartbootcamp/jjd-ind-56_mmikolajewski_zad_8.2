package pl.javastart.task.tickets;

import pl.javastart.task.Place;

public class GiftTicket extends Ticket {
    GiftTicket(String titleEvent, Place place, double basicPrice) {
        super(titleEvent, place, basicPrice);
        setType("Bilet prezentowy");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println();
    }
}