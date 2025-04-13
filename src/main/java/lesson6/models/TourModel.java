package lesson6.models;

public class TourModel {
    public String id;
    public String country;
    public String city;
    public String transfer;
    public String days;
    public String price;
    public String stars;
    public String food;

    public TourModel(String [] tour) {
        this.id = tour[0];
        this.country = tour[1];
        this.city = tour[2];
        this.transfer = tour[3];
        this.days = tour[4];
        this.price = tour[5];
        this.stars = tour[6];
        this.food = tour[7];
    }
}
