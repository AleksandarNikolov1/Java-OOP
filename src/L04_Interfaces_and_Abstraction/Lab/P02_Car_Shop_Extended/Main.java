package L04_Interfaces_and_Abstraction.Lab.P02_Car_Shop_Extended;

public class Main {
    public static void main(String[] args) {
        Sellable seat = new Seat("Leon", "Gray", 110, "Spain", 11111.1);
        Rentable audi = new Audi("A4", "Gray", 110, "Germany", 3, 99.9);

        printCarInfo(seat);
        printCarInfo(audi);

    }

    private static void printCarInfo(Car car) {
        System.out.println(String.format(
                "%s is %s color and have %s hose power",
                car.getModel(),
                car.getColor(),
                car.getHorsePower()));

        System.out.println(car.toString());
    }
}
