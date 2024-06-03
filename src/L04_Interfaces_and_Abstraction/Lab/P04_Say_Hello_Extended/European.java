package L04_Interfaces_and_Abstraction.Lab.P04_Say_Hello_Extended;

public class European extends BasePerson{

    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
