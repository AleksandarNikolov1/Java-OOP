package L03_Inheritance.Exercise.P05_Restaurant.restaurant;

import java.math.BigDecimal;

public class Salmon extends MainDish {
    private static final double SALMON_GRAMS = 22;

    public Salmon(String name, BigDecimal price) {
        super(name, price, SALMON_GRAMS);
    }
}
