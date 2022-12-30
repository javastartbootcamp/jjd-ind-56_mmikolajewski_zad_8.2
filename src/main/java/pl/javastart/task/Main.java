package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        System.out.println("Bilet online");
        OnlineTicket onlineTicket = dataReader.createOnlineTicket();
        System.out.println("Bilet standardowy");
        StandardTicket standardTicket = dataReader.createStandardTicket();
        System.out.println("Bilet prezent");
        GiftTicket giftTicket = dataReader.createGiftTicket();

        double price1 = PriceCalculator.countPrice(onlineTicket);
        System.out.println(price1);
        double price2 = PriceCalculator.countPrice(standardTicket);
        System.out.println(price2);
        double price3 = PriceCalculator.countPrice(giftTicket);
        System.out.println(price3);

        onlineTicket.printInfo();
        System.out.println("Cena ostateczna: " + price1 + "zł");

        standardTicket.printInfo();
        System.out.println("Cena ostateczna: " + price2 + "zł");

        giftTicket.printInfo();
        System.out.println("Cena ostateczna: " + price3 + "zł");

        System.out.println("Suma sprzedanych biletów: " + Ticket.getId());
    }
}