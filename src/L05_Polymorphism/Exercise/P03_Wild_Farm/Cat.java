package L05_Polymorphism.Exercise.P03_Wild_Farm;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String bread;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String bread) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.bread = bread;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat();
        return String.format("%s[%s, %s, %s, %s, %d]", this.getAnimalType(),
       this.getAnimalName(), this.bread, df.format(this.getAnimalWeight()), this.getLivingRegion(), this.getFoodEaten());
    }
}


