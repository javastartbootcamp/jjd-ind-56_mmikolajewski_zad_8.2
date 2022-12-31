package pl.javastart.task;

public class Place {

    private String city;
    private String street;

    public Place(String city) {
        this.city = city;
        this.street = "Stadion";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}