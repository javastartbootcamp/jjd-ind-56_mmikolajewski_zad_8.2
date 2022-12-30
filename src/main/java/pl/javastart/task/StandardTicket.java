package pl.javastart.task;

public class StandardTicket extends Ticket {
    public StandardTicket(String titleEvent, String place) {
        super(titleEvent, place);
        setType("Bilet standardowy");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println();
    }
}

