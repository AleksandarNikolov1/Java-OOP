package L02_Encapsulation.Exercise.P04_Pizza_Calories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10)
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");

        this.toppings = new ArrayList<>(numberOfToppings);
    }

    private void setName(String name) {
        if (name.isEmpty() || name.isBlank())
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols");

        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    public double getOverallCalories (){
        return dough.calculateCalories() + toppings.stream().mapToDouble(Topping::calculateCalories).sum();
    }
}
