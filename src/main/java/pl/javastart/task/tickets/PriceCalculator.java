package pl.javastart.task.tickets;

import pl.javastart.task.tickets.StandardTicket;
import pl.javastart.task.tickets.GiftTicket;
import pl.javastart.task.tickets.OnlineTicket;
import pl.javastart.task.tickets.Ticket;

public class PriceCalculator {
    private static final double HUNDRED_IN_DECIMAL = 1;
    private static final double POST_FEE = 5;

    public static double countPrice(OnlineTicket ticket) {
        double price = pricePlusDiscount(ticket);
        return price;
    }

    public static double countPrice(StandardTicket ticket) {
        return standardPrice(ticket);
    }

    public static double countPrice(GiftTicket ticket) {
        return giftPrice(ticket);
    }

    private static double pricePlusDiscount(Ticket ticket) {
        return ticket.getBasicPrice() * (HUNDRED_IN_DECIMAL - Ticket.DISCOUNT);
    }

    private static double standardPrice(Ticket ticket) {
        double price = pricePlusDiscount(ticket);
        return price + POST_FEE;
    }

    private static double giftPrice(Ticket ticket) {
        double price = standardPrice(ticket);
        return price + giftFee(ticket);
    }

    private static double giftFee(Ticket ticket) {
        return 0.05 * ticket.getBasicPrice();
    }

    public static void printFinalPrice(double price) {
        System.out.println("Cena finalna " + price);
    }
}