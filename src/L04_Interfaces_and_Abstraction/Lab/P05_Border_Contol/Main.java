package L04_Interfaces_and_Abstraction.Lab.P05_Border_Contol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Identifiable> identifiableList = new ArrayList<>();

        while(true){
            String input = sc.nextLine();

            if (input.equals("End"))
                break;

            String[] tokens = input.split(" ");

            Identifiable identifiable = null;

            if (tokens.length == 3)
                identifiable = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);

            else
                identifiable = new Robot(tokens[0], tokens[1]);

            identifiableList.add(identifiable);
        }

        String lastDigitsOfFakeIds = sc.nextLine();

        for (Identifiable identifiable : identifiableList) {
            if (identifiable.getId().endsWith(lastDigitsOfFakeIds))
                System.out.println(identifiable.getId());
        }
    }
}
