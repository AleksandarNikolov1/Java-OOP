package L01_Working_with_Abstraction.Lab.P04_Hotel_Reservation;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int numRepresentation;

    private Season(int numRepresentation) {
        this.numRepresentation = numRepresentation;
    }

    public int getNumRepresentation() {
        return numRepresentation;
    }
}
