package pl.javastart.task.tickets;

import pl.javastart.task.Place;

public class Ticket {

    private String titleEvent;
    private Place place;
    private String type;

    private static int globalId = 1;
    private int id;
    private double basicPrice;

    private static int counter = 0;

    public static final double DISCOUNT = 0.1;

    public Ticket(String titleEvent, Place place, double basicPrice) {
        this.id = globalId++;
        this.titleEvent = titleEvent;
        this.place = place;
        this.basicPrice = basicPrice;
        counter++;

    }

    void printInfo() {
        System.out.print("id: " + id + " Nazwa wydażenia: " + titleEvent + ", Miejsce wydażenia: "
                + place.getCity() + ", typ biletu: " + type);
    }

    public String getTitleEvent() {
        return titleEvent;
    }

    protected void setTitleEvent(String titleEvent) {
        this.titleEvent = titleEvent;
    }

    public Place getPlace() {
        return place;
    }

    protected void setPlace(Place place) {
        this.place = place;
    }

    protected String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    protected void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }

    public static int getCounter() {
        return counter;
    }
}