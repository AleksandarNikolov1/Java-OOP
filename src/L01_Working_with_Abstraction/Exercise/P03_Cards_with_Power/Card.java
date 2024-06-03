package L01_Working_with_Abstraction.Exercise.P03_Cards_with_Power;

public class Card {
    private CardsPower rank;
    private SuitsPower suit;

    public Card(String rank, String suit) {
        this.rank = CardsPower.valueOf(rank);
        this.suit = SuitsPower.valueOf(suit);
    }

    private int calculatePower(){
        return rank.getPower() + suit.getPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", rank, suit, calculatePower());
    }
}
