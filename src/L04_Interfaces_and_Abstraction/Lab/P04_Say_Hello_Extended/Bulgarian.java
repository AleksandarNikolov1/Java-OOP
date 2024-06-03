package L04_Interfaces_and_Abstraction.Lab.P04_Say_Hello_Extended;

public class Bulgarian extends BasePerson{

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
