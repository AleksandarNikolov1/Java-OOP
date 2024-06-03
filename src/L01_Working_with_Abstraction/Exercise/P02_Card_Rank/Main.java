package L01_Working_with_Abstraction.Exercise.P02_Card_Rank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        CardRank[] cardRanks = CardRank.values();

        System.out.println(input + ":");
        for (CardRank cardRank : cardRanks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name());
        }
    }
}
