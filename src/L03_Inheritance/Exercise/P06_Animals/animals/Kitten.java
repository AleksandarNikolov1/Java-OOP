package L03_Inheritance.Exercise.P06_Animals.animals;

public class Kitten extends Animal{
    private static final String KITTEN_GENDER = "Female";
    public Kitten(String name, int age) {
        super(name, age, KITTEN_GENDER);
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
