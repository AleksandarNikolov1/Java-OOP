package L01_Working_with_Abstraction.Exercise.P01_Card_Suit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        CardSuit[] cardSuit = CardSuit.values();

        System.out.println(input + ":");
        for (CardSuit card : cardSuit) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card.name());
        }
    }
}
