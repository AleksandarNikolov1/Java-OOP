package L04_Interfaces_and_Abstraction.Lab.P04_Say_Hello_Extended;

public abstract class BasePerson implements Person{
    private String name;

    protected BasePerson(String name) {
        this.setName(name);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
