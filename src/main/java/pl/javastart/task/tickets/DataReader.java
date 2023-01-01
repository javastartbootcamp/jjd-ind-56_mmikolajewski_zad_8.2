package pl.javastart.task.tickets;

import pl.javastart.task.Place;
import java.util.Scanner;

public class DataReader {
    Scanner scanner = new Scanner(System.in);

    public OnlineTicket createOnlineTicket() {
        System.out.println("Bilet online");
        String title = takeTitle();
        Place place = takePlace();
        double price = takePrice();
        return new OnlineTicket(title, place, price);
    }

    public StandardTicket createStandardTicket() {
        System.out.println("Bilet standardowy");
        String title = takeTitle();
        Place place = takePlace();
        double price = takePrice();
        return new StandardTicket(title, place, price);
    }

    public GiftTicket createGiftTicket() {
        System.out.println("Bilet prezent");
        String title = takeTitle();
        Place place = takePlace();
        double price = takePrice();
        return new GiftTicket(title, place, price);
    }

    private String takeTitle() {
        System.out.println("Podaj nazwę wydarzenia: ");
        String title = scanner.nextLine();
        return title;
    }

    private Place takePlace() {
        System.out.println("Podaj miejsce wydarzenia: ");
        String place = scanner.nextLine();
        return new Place(place);
    }

    private double takePrice() {
        System.out.println("Podaj cenę");
        double price = scanner.nextInt();
        scanner.nextLine();
        return price;
    }
}