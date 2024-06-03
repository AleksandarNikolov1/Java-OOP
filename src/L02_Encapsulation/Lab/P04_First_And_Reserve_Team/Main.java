package L02_Encapsulation.Lab.P04_First_And_Reserve_Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Person> players = new ArrayList<>();

        while (n-- > 0){
            String[] tokens = sc.nextLine().split("\\s+");
            String fName = tokens[0];
            String lName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            double salary = Double.parseDouble(tokens[3]);

            players.add(new Person(fName, lName, age, salary));
        }

        Team team = new Team("Black Eagles");
        for (Person player : players) {
            team.addPlayer(player);
        }


        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");
    }
}
