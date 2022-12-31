package pl.javastart.task;

public class GiftTicket extends Ticket {
    public GiftTicket(String titleEvent, Place place) {
        super(titleEvent, place);
        setType("Bilet prezentowy");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println();
    }
}