package pl.javastart.task;

public class Ticket {

    private String titleEvent;
    private Place place;
    private String type;

    private static final double basicPrice = 150;
    private static final double dicount = 0.1;
    private static int id = 0;

    public Ticket(String titleEvent, Place place) {
        this.titleEvent = titleEvent;
        this.place = place;
        this.id++;
    }

    void printInfo() {
        System.out.print("Nazwa wydażenia: " + titleEvent + ", Miejsce wydażenia: "
                + place.getCity() + ", " + place.getStreet() + ", typ biletu: " + type);
    }

    public String getTitleEvent() {
        return titleEvent;
    }

    public void setTitleEvent(String titleEvent) {
        this.titleEvent = titleEvent;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static double getBasicPrice() {
        return basicPrice;
    }

    public static double getDicount() {
        return dicount;
    }

    public static int getId() {
        return id;
    }
}
