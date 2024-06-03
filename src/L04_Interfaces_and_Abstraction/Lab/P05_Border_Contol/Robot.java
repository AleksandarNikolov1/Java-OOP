package L04_Interfaces_and_Abstraction.Lab.P05_Border_Contol;

public class Robot implements Identifiable{
    private String id;
    private String model;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String getId() {
        return id;
    }
}
