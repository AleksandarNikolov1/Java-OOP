package L05_Polymorphism.Exercise.P03_Wild_Farm;

public class Tiger extends Felime {
    private String livingRegion;

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat){
            this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
        }

        else
            System.out.println("Tigers are not eating that type of food!");
    }
}
