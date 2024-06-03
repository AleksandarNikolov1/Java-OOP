package L01_Working_with_Abstraction.Exercise.P03_Cards_with_Power;

public enum SuitsPower {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    SuitsPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
