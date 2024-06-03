package L02_Encapsulation.Exercise.P04_Pizza_Calories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] pizzaInfo = sc.nextLine().split("\\s+");
        String[] doughInfo = sc.nextLine().split("\\s+");

        Pizza pizza = null;

        try {
            pizza = new Pizza(pizzaInfo[1], Integer.parseInt(pizzaInfo[2]));
            Dough dough = new Dough(doughInfo[1], doughInfo[2], Double.parseDouble(doughInfo[3]));

            pizza.setDough(dough);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        if (pizza != null) {
            String input = sc.nextLine();

            while (!input.equals("END")) {
                String[] toppingInfo = input.split("\\s+");

                try {
                    pizza.addTopping(new Topping(toppingInfo[1], Double.parseDouble(toppingInfo[2])));
                }

                catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }

            System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());

        }
    }
}
