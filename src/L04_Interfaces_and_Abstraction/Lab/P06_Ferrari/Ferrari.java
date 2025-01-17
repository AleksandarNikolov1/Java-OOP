package L04_Interfaces_and_Abstraction.Lab.P06_Ferrari;

public class Ferrari implements Car{
    private static final String MODEL = "488-Spider";

    private String driverName;
    private String model;

    public Ferrari(String driverName) {
        this.driverName = driverName;
        this.model = MODEL;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",
                model, brakes(), gas(), driverName);
    }
}
