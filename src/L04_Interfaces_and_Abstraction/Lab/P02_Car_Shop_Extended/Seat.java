package L04_Interfaces_and_Abstraction.Lab.P02_Car_Shop_Extended;

public class Seat extends CarImpl implements Sellable{

    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s sells for %f", super.toString(), this.getModel(), this.getPrice());
    }
}
