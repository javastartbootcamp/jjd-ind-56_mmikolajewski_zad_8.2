package pl.javastart.task;

import pl.javastart.task.tickets.GiftTicket;
import pl.javastart.task.tickets.OnlineTicket;
import pl.javastart.task.tickets.StandardTicket;
import pl.javastart.task.tickets.Ticket;
import pl.javastart.task.tickets.DataReader;
import pl.javastart.task.tickets.PriceCalculator;

public class Main {

    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        OnlineTicket onlineTicket = dataReader.createOnlineTicket();
        StandardTicket standardTicket = dataReader.createStandardTicket();
        GiftTicket giftTicket = dataReader.createGiftTicket();

        double price1 = PriceCalculator.countPrice(onlineTicket);
        System.out.println(price1);
        double price2 = PriceCalculator.countPrice(standardTicket);
        System.out.println(price2);
        double price3 = PriceCalculator.countPrice(giftTicket);
        System.out.println(price3);

        onlineTicket.printInfo();
        PriceCalculator.printFinalPrice(price1);
        standardTicket.printInfo();
        PriceCalculator.printFinalPrice(price2);
        giftTicket.printInfo();
        PriceCalculator.printFinalPrice(price3);

        System.out.println("Suma sprzedanych biletów: " + Ticket.getCounter());
    }
}