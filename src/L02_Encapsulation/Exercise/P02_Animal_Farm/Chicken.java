package L02_Encapsulation.Exercise.P02_Animal_Farm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty())
            throw new IllegalArgumentException("Name cannot be empty.");
        else
            this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 15)
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        else
            this.age = age;
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.", name, age, productPerDay());
    }

    private double calculateProductPerDay() {
        if (this.age <= 5)
            return 2;

        else if (this.age <= 11)
            return 1;

        else
            return 0.75;
    }
}
