package L05_Polymorphism.Exercise.P03_Wild_Farm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int lineCounter = 0;

        List<Animal> animals = new ArrayList<>();
        List<Food> foods = new ArrayList<>();

        while (!input.equals("End")) {

            String[] tokens = input.split("\\s+");


            Animal animal = null;
            Food food = null;


            if (lineCounter % 2 == 0) {
                String type = tokens[0];
                String name = tokens[1];
                Double weight = Double.parseDouble(tokens[2]);
                String livingRegion = tokens[3];

                if (tokens.length > 4) {
                    String catBreed = tokens[4];
                    animal = new Cat(name, type, weight, livingRegion, catBreed);
                }

                switch (type) {
                    case "L05_Polymorphism.Exercise.P03_Wild_Farm.Zebra":
                        animal = new Zebra(name, type, weight, livingRegion);
                        break;
                    case "L05_Polymorphism.Exercise.P03_Wild_Farm.Tiger":
                        animal = new Tiger(name, type, weight, livingRegion);
                        break;
                    case "L05_Polymorphism.Exercise.P03_Wild_Farm.Mouse":
                        animal = new Mouse(name, type, weight, livingRegion);
                }
            }

            if (animal != null)
                animals.add(animal);


            else {
                String foodType = tokens[0];
                Integer quantity = Integer.parseInt(tokens[1]);

                if (foodType.equals("L05_Polymorphism.Exercise.P03_Wild_Farm.Vegetable"))
                    food = new Vegetable(quantity);

                else
                    food = new Meat(quantity);
            }

            if (food != null)
                foods.add(food);

            lineCounter++;
            input = sc.nextLine();

        }

        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            animal.makeSound();
            animal.eat(foods.get(i));
            System.out.println(animal.toString());
        }
    }
}
