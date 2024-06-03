package L05_Polymorphism.Exercise.P03_Wild_Farm;

import java.text.DecimalFormat;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten;

    public Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void animalType(String animalName) {
        this.animalName = animalName;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(Double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();
    public abstract void eat(Food food);

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat();
        return String.format("%s[%s, %s, %s, %d]", this.animalType,
                this.animalType, this.animalName, df.format(this.animalWeight), this.foodEaten);
    }
}
