package L03_Inheritance.Exercise.P06_Animals.animals;

public class Tomcat extends Animal{
    private static final String TOMCAT_GENDER = "Male";
    public Tomcat(String name, int age) {
        super(name, age, TOMCAT_GENDER);
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}
