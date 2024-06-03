package L02_Encapsulation.Exercise.P05_Football_Team_Generator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.isEmpty() || name.isBlank())
            throw new IllegalArgumentException("A name should not be empty.");

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void removePlayer(String name){
        Player player = players.stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
        if (player != null){
            players.remove(player);
        }

        else
            throw new IllegalArgumentException("Player " + name + " is not in " + this.name + " team.");

    }

    public double getRating(){
        return players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0);
    }

}
