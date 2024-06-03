package L05_Polymorphism.Exercise.P03_Wild_Farm;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable){
            this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
        }

        else
            System.out.println("Mouses are not eating that type of food!");
    }
}
