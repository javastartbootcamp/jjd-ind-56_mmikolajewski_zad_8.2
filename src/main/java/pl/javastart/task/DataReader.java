package pl.javastart.task;

import java.util.Scanner;

public class DataReader {
    Scanner scanner = new Scanner(System.in);

    public OnlineTicket createOnlineTicket() {
        String title = takeTitle();
        Place place = takePlace();
        return new OnlineTicket(title, place);
    }

    public StandardTicket createStandardTicket() {
        String title = takeTitle();
        Place place = takePlace();
        return new StandardTicket(title, place);
    }

    public GiftTicket createGiftTicket() {
        String title = takeTitle();
        Place place = takePlace();
        return new GiftTicket(title, place);
    }

    private String takeTitle() {
        System.out.println("Podaj nazwę wydarzenia: ");
        return scanner.nextLine();
    }

    private Place takePlace() {
        System.out.println("Podaj miejsce wydarzenia: Warszawa lub Kraków");
        String place = scanner.nextLine();
        return new Place(place);
    }
}