package L01_Working_with_Abstraction.Lab.P04_Hotel_Reservation;

public class PriceCalculator {
    private double pricePerDay;
    private int days;
    private Season season;
    private DiscountType discount;

    public PriceCalculator(double pricePerDay, int days, Season season, DiscountType discount) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.season = season;
        this.discount = discount;
    }

    public double calculate(){
       return (pricePerDay * days * season.getNumRepresentation()) * (1 - discount.getDiscount());
    }
}
