package L03_Inheritance.Exercise.P05_Restaurant.restaurant;

import java.math.BigDecimal;

public class ColdBeverage extends Beverage{
    public ColdBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}