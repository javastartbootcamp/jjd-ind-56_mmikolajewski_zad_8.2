package pl.javastart.task;

public class OnlineTicket extends Ticket {
    public OnlineTicket(String titleEvent, Place place) {
        super(titleEvent, place);
        setType("Bilet internetetowy");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println();
    }
}
