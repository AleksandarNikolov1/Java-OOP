package L04_Interfaces_and_Abstraction.Lab.P03_Say_Hello;

public class European implements Person{

    private String name;

    public European(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
