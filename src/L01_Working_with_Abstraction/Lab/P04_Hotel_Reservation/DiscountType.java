package L01_Working_with_Abstraction.Lab.P04_Hotel_Reservation;

public enum DiscountType {
    VIP(0.2),
    SECONDVISIT(0.1),
    NONE(0);

    private double discount;

    private DiscountType(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
