package pl.javastart.task;

public class PriceCalculator {

    public static double countPrice(OnlineTicket ticket) {
        return onlinePrice();
    }

    public static double countPrice(StandardTicket ticket) {
        return standardPrice();
    }

    public static double countPrice(GiftTicket giftTicket) {
        return giftPrice();
    }

    private static double onlinePrice() {
        return Ticket.getBasicPrice() * (1 - Ticket.getDicount());
    }

    private static double standardPrice() {
        double online = onlinePrice();
        return online + 5;
    }

    private static double giftPrice() {
        double standard = standardPrice();
        return standard + (0.05 * onlinePrice());
    }
}