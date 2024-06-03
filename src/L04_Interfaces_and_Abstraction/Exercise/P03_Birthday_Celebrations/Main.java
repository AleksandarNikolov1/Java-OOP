package L04_Interfaces_and_Abstraction.Exercise.P03_Birthday_Celebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        List<Birthable> citizensAndPets = new ArrayList<>();
        List<Identifiable> identifiableList = new ArrayList<>();

        while (!input.equals("End")){
            String[] tokens = input.split("\\s+");

            if (tokens[0].equals("Citizen"))
                citizensAndPets.add(new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]));


            else if (tokens[0].equals("Pet"))
                citizensAndPets.add(new Pet(tokens[1], tokens[2]));

            else
                identifiableList.add(new Robot(tokens[1], tokens[2]));

            input = sc.nextLine();
        }

        String year = sc.nextLine();

        for (Birthable citizensAndPet : citizensAndPets) {
            if (citizensAndPet.getBirthDate().endsWith(year)){
                System.out.println(citizensAndPet.getBirthDate());
            }
        }
    }
}
