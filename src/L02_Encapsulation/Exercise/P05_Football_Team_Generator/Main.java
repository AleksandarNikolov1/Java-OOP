package L02_Encapsulation.Exercise.P05_Football_Team_Generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Team> teams = new ArrayList<>();

        String input = sc.nextLine();

        while (!input.equals("END")){
            String[] tokens = input.split(";");
            String command = tokens[0];

            if (command.equals("Team")){
                try {
                    Team team = new Team(tokens[1]);
                    teams.add(team);
                }

                catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }

            else if (command.equals("Add")){
                try {
                    Team team = teams.stream().filter(t -> t.getName().equals(tokens[1]))
                            .findFirst().orElse(null);

                    if (team != null) {
                        Player player = new Player(tokens[2], Integer.parseInt(tokens[3]),
                                Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]),
                                Integer.parseInt(tokens[6]), Integer.parseInt(tokens[7]));

                        team.addPlayer(player);
                    }

                    else
                        System.out.println("Team " + tokens[1] + " does not exist.");
                    }

                catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }


            else if (command.equals("Remove")){
                try {
                    teams.stream().filter(t -> t.getName().equals(tokens[1]))
                            .findFirst().ifPresent(team -> team.removePlayer(tokens[2]));
                }

                catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }

            else if (command.equals("Rating")){
                Team team = teams.stream().filter(t -> t.getName().equals(tokens[1]))
                        .findFirst().orElse(null);

                if (team != null){
                    System.out.printf("%s - %d%n", team.getName(), (int) Math.round(team.getRating()));
                }

                else
                    System.out.println("Team " + tokens[1] + " does not exist.");
            }


            input = sc.nextLine();
        }
    }
}
