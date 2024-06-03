package L03_Inheritance.Exercise.P04_Need_for_Speed;

public class Car extends Vehicle{
    private static final double DEFAULT_FUEL_CONSUMPTION = 3;
    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }

}
